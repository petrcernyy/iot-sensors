/* MQTT (over TCP) Example

   This example code is in the Public Domain (or CC0 licensed, at your option.)

   Unless required by applicable law or agreed to in writing, this
   software is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
   CONDITIONS OF ANY KIND, either express or implied.
*/

#include <stdio.h>
#include <stdint.h>
#include <stddef.h>
#include <string.h>
#include "esp_wifi.h"
#include "esp_system.h"
#include "nvs_flash.h"
#include "esp_event.h"
#include "esp_netif.h"
#include "protocol_examples_common.h"

#include "freertos/FreeRTOS.h"
#include "freertos/task.h"
#include "freertos/semphr.h"
#include "freertos/queue.h"
#include "freertos/event_groups.h"
#include "driver/gpio.h"

#include "lwip/sockets.h"
#include "lwip/dns.h"
#include "lwip/netdb.h"

#include "esp_log.h"
#include "mqtt_client.h"

#include "DHT.h"

static const char *TAG_Main = "Main";
static const char *TAG_Task_LED = "LED_Task";
static const char *TAG_Task_MQTT = "MQTT_Task";
static const char *TAG_Task_DHT = "DHT_Task";
static const char *TAG_mqtt = "MQTT";

#define LED GPIO_NUM_1

static QueueHandle_t temp_queue;
static QueueHandle_t hum_queue;

char topic_temp[50];
char topic_hum[50];
char flag_ready = 0;

static void mqtt_event_handler(void *handler_args, esp_event_base_t base, int32_t event_id, void *event_data)
{
    ESP_LOGD(TAG_mqtt, "Event dispatched from event loop base=%s, event_id=%" PRIi32 "", base, event_id);
    esp_mqtt_event_handle_t event = event_data;
    esp_mqtt_client_handle_t client = event->client;
    char rcv_mess[50];
    char rcv_topic[50];
    switch ((esp_mqtt_event_id_t)event_id) {
    case MQTT_EVENT_CONNECTED:
        ESP_LOGI(TAG_mqtt, "MQTT_EVENT_CONNECTED");
        break;
    case MQTT_EVENT_DISCONNECTED:
        ESP_LOGI(TAG_mqtt, "MQTT_EVENT_DISCONNECTED");
        break;
    case MQTT_EVENT_SUBSCRIBED:
        ESP_LOGI(TAG_mqtt, "MQTT_EVENT_SUBSCRIBED, msg_id=%d", event->msg_id);
        break;
    case MQTT_EVENT_UNSUBSCRIBED:
        ESP_LOGI(TAG_mqtt, "MQTT_EVENT_UNSUBSCRIBED, msg_id=%d", event->msg_id);
        break;
    case MQTT_EVENT_PUBLISHED:
        ESP_LOGI(TAG_mqtt, "MQTT_EVENT_PUBLISHED, msg_id=%d", event->msg_id);
        break;
    case MQTT_EVENT_DATA:
        ESP_LOGI(TAG_mqtt, "MQTT_EVENT_DATA");
        printf("TOPIC=%.*s\r\n", event->topic_len, event->topic);
        printf("DATA=%.*s\r\n", event->data_len, event->data);
        sprintf(rcv_mess, "%.*s", event->data_len, event->data);
        if (strcmp(rcv_mess, "on") == 0) {
            ESP_LOGI(TAG_mqtt, "Setting LED on.");
            gpio_set_level(LED, 1);
        }
        else if (strcmp(rcv_mess, "off") == 0) {
            ESP_LOGI(TAG_mqtt, "Setting LED off.");
            gpio_set_level(LED, 0);
        }
        sprintf(rcv_topic, "%.*s", event->topic_len, event->topic);
        if (strcmp(rcv_topic, "/createScene") == 0) {
            ESP_LOGI(TAG_mqtt, "Creating scene");
            sprintf(topic_temp, "/%.*s/temperature", event->data_len, event->data);
            sprintf(topic_hum, "/%.*s/humidity", event->data_len, event->data);
            esp_mqtt_client_publish(client, "/addScene", rcv_mess, 0, 1, 0);
            flag_ready = 1;
        }
        break;
    case MQTT_EVENT_ERROR:
        ESP_LOGI(TAG_mqtt, "MQTT_EVENT_ERROR");
        break;
    default:
        ESP_LOGI(TAG_mqtt, "Other event id:%d", event->event_id);
        break;
    }
}

void MQTT(void *pvParameters) {

    ESP_LOGI(TAG_Task_MQTT, "Starting MQTT Task\n\n");

    esp_mqtt_client_handle_t client = *(esp_mqtt_client_handle_t *)pvParameters;

    float temp;
    float hum;

    char hum_mess[10];
    char temp_mess[10];

    while (true) {

        if (flag_ready) {
            if ((xQueueReceive(hum_queue, &hum, 0)) == pdTRUE) {
                ESP_LOGI(TAG_Task_MQTT, "Received humidity data, publishing to mqtt.");
                sprintf(hum_mess, "%f", hum);
                esp_mqtt_client_publish(client, topic_hum, hum_mess, 0, 1, 0);
            }
            else if ((xQueueReceive(temp_queue, &temp, 0)) == pdTRUE) {
                ESP_LOGI(TAG_Task_MQTT, "Received temperature data, publishing to mqtt.");
                sprintf(temp_mess, "%f", temp);
                esp_mqtt_client_publish(client, topic_temp, temp_mess, 0, 1, 0);
            }
        }
        vTaskDelay( 100 / portTICK_PERIOD_MS);
    }
}

void DHT_task(void *pvParameters) {

    setDHTgpio(GPIO_NUM_4);

    ESP_LOGI(TAG_Task_DHT, "Starting DHT Task\n\n");

    float humidity;
    float temperature;

    while (true) {

        ESP_LOGI(TAG_Task_DHT, "=== Reading DHT ===\n");
        int ret = readDHT();

        errorHandler(ret);

        ESP_LOGI(TAG_Task_DHT, "Hum: %.1f Tmp: %.1f\n", humidity = getHumidity(), temperature = getTemperature());
        ESP_LOGI(TAG_Task_DHT, "Sending data from task DHT22");

        xQueueSend(hum_queue, &humidity, 10);
        xQueueSend(temp_queue, &temperature, 10);

        vTaskDelay(5000 / portTICK_PERIOD_MS);
    }
}

/*void toggleLED(void *pvParameters) {

    ESP_LOGI(TAG_Task_LED, "Starting LED Task\n\n");

    gpio_set_direction(LED, GPIO_MODE_DEF_OUTPUT);

    while (true) {
        gpio_set_level(LED, 1);
        vTaskDelay(200 / portTICK_PERIOD_MS);
        gpio_set_level(LED, 0);
        vTaskDelay(200 / portTICK_PERIOD_MS);
    }
}*/

void app_main(void) {
    ESP_LOGI(TAG_Main, "[APP] Startup..");
    ESP_LOGI(TAG_Main, "[APP] Free memory: %" PRIu32 " bytes", esp_get_free_heap_size());
    ESP_LOGI(TAG_Main, "[APP] IDF version: %s", esp_get_idf_version());

    esp_log_level_set("*", ESP_LOG_INFO);
    esp_log_level_set("mqtt_client", ESP_LOG_VERBOSE);
    esp_log_level_set("mqtt_example", ESP_LOG_VERBOSE);

    ESP_ERROR_CHECK(nvs_flash_init());
    ESP_ERROR_CHECK(esp_netif_init());
    ESP_ERROR_CHECK(esp_event_loop_create_default());

    ESP_ERROR_CHECK(example_connect());

    esp_rom_gpio_pad_select_gpio(GPIO_NUM_4);

    gpio_set_direction(LED, GPIO_MODE_DEF_OUTPUT);

    esp_mqtt_client_config_t mqtt_cfg = {
        .broker.address.uri="mqtt://192.168.0.112:1883", //Uniform Resource Identifier includes path,protocol
    };

    esp_mqtt_client_handle_t client = esp_mqtt_client_init(&mqtt_cfg);
    /* The last argument may be used to pass data to the event handler, in this example mqtt_event_handler */
    esp_mqtt_client_register_event(client, ESP_EVENT_ANY_ID, mqtt_event_handler, NULL);
    esp_mqtt_client_start(client);

    vTaskDelay(5000 / portTICK_PERIOD_MS);

    esp_mqtt_client_subscribe(client, "/home/led", 0);
    ESP_LOGI(TAG_Main, "Subscribed");

    esp_mqtt_client_subscribe(client, "/createScene", 0);
    ESP_LOGI(TAG_Main, "Subscribed");

    hum_queue = xQueueCreate(5, sizeof(float));
    temp_queue = xQueueCreate(5, sizeof(float));

    xTaskCreate(DHT_task, "DHT Task", 2048, NULL, 5, NULL);
    xTaskCreate(MQTT, "MQTT", 2048, (void *)&client, 6, NULL);
    //xTaskCreate(toggleLED, "Toogle LED", 1024, NULL, 4, NULL);

    esp_mqtt_client_publish(client, "/ready", "ready for pairing", 0, 1, 0);
    ESP_LOGI(TAG_Main, "Ready for pairing");

}
