#include <stdio.h>
#include <stdint.h>
#include <stddef.h>
#include <string.h>

#include "esp_wifi.h"
#include "esp_system.h"
#include "esp_sleep.h"
#include "esp_log.h"
#include "esp_event.h"
#include "esp_netif.h"

#include "nvs.h"
#include "nvs_flash.h"

#include "freertos/FreeRTOS.h"
#include "freertos/task.h"
#include "freertos/event_groups.h"

#include "mqtt_client.h"

#include "sht30.h"

#define SCL_PIN 8
#define SDA_PIN 9
#define I2C_PORT 0
#define I2C_SPEED 10000

#define EXAMPLE_ESP_WIFI_SSID      "BrNet.cz/Veveri39"
#define EXAMPLE_ESP_WIFI_PASS      "64884233"
#define EXAMPLE_ESP_MAXIMUM_RETRY  5

#define MQTT_ADDRESS                "mqtt://192.168.0.104:1883"

#define ESP_WIFI_SAE_MODE WPA3_SAE_PWE_BOTH
#define EXAMPLE_H2E_IDENTIFIER ""

#define WIFI_CONNECTED_BIT BIT0
#define WIFI_FAIL_BIT      BIT1

char topic_temp[50];
char topic_hum[50];
char flag_ready = 0;

static int s_retry_num = 0;

static EventGroupHandle_t s_wifi_event_group;
nvs_handle_t my_handle;
sht30_t sht30;

static const char *TAG_WIFI = "WIFI";
static const char *TAG_Main = "Main";
static const char *TAG_mqtt = "MQTT";
static const char *TAG_Watch = "WATCHDOG";

void watchDog(void *parameter)
{
    static int counter = 0;

    while (1) {
        counter++;
        if (counter > 100) {
            ESP_LOGI(TAG_Watch, "Unable to connect. Performing restart.");
            esp_restart();
        }
        vTaskDelay( 1000 / portTICK_PERIOD_MS);
    }
}

static void event_handler(void* arg, esp_event_base_t event_base,
                                int32_t event_id, void* event_data)
{
    if (event_base == WIFI_EVENT && event_id == WIFI_EVENT_STA_START) {
        esp_wifi_connect();
    } else if (event_base == WIFI_EVENT && event_id == WIFI_EVENT_STA_DISCONNECTED) {
        if (s_retry_num < EXAMPLE_ESP_MAXIMUM_RETRY) {
            esp_wifi_connect();
            s_retry_num++;
            ESP_LOGI(TAG_WIFI, "retry to connect to the AP");
        } else {
            xEventGroupSetBits(s_wifi_event_group, WIFI_FAIL_BIT);
        }
        ESP_LOGI(TAG_WIFI,"connect to the AP fail");
    } else if (event_base == IP_EVENT && event_id == IP_EVENT_STA_GOT_IP) {
        ip_event_got_ip_t* event = (ip_event_got_ip_t*) event_data;
        ESP_LOGI(TAG_WIFI, "got ip:" IPSTR, IP2STR(&event->ip_info.ip));
        s_retry_num = 0;
        xEventGroupSetBits(s_wifi_event_group, WIFI_CONNECTED_BIT);
    }
}

void wifi_init_sta(void)
{
    s_wifi_event_group = xEventGroupCreate();

    ESP_ERROR_CHECK(esp_netif_init());

    ESP_ERROR_CHECK(esp_event_loop_create_default());
    esp_netif_create_default_wifi_sta();

    wifi_init_config_t cfg = WIFI_INIT_CONFIG_DEFAULT();
    ESP_ERROR_CHECK(esp_wifi_init(&cfg));

    esp_event_handler_instance_t instance_any_id;
    esp_event_handler_instance_t instance_got_ip;
    ESP_ERROR_CHECK(esp_event_handler_instance_register(WIFI_EVENT,
                                                        ESP_EVENT_ANY_ID,
                                                        &event_handler,
                                                        NULL,
                                                        &instance_any_id));
    ESP_ERROR_CHECK(esp_event_handler_instance_register(IP_EVENT,
                                                        IP_EVENT_STA_GOT_IP,
                                                        &event_handler,
                                                        NULL,
                                                        &instance_got_ip));

    wifi_config_t wifi_config = {
        .sta = {
            .ssid = EXAMPLE_ESP_WIFI_SSID,
            .password = EXAMPLE_ESP_WIFI_PASS,
            .threshold.authmode = WIFI_AUTH_WPA2_PSK,
            .sae_pwe_h2e = ESP_WIFI_SAE_MODE,
            .sae_h2e_identifier = EXAMPLE_H2E_IDENTIFIER,
        },
    };
    ESP_ERROR_CHECK(esp_wifi_set_mode(WIFI_MODE_STA) );
    ESP_ERROR_CHECK(esp_wifi_set_config(WIFI_IF_STA, &wifi_config) );
    ESP_ERROR_CHECK(esp_wifi_start() );

    ESP_LOGI(TAG_WIFI, "wifi_init_sta finished.");

    EventBits_t bits = xEventGroupWaitBits(s_wifi_event_group,
            WIFI_CONNECTED_BIT | WIFI_FAIL_BIT,
            pdFALSE,
            pdFALSE,
            portMAX_DELAY);

    if (bits & WIFI_CONNECTED_BIT) {
        ESP_LOGI(TAG_WIFI, "connected to ap SSID:%s password:%s",
                 EXAMPLE_ESP_WIFI_SSID, EXAMPLE_ESP_WIFI_PASS);
    } else if (bits & WIFI_FAIL_BIT) {
        ESP_LOGI(TAG_WIFI, "Failed to connect to SSID:%s, password:%s",
                 EXAMPLE_ESP_WIFI_SSID, EXAMPLE_ESP_WIFI_PASS);
    } else {
        ESP_LOGE(TAG_WIFI, "UNEXPECTED EVENT");
    }
}

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
        sprintf(rcv_mess, "%.*s", event->data_len, event->data);
        sprintf(rcv_topic, "%.*s", event->topic_len, event->topic);
        sprintf(topic_temp, "/%.*s/temperature", event->data_len, event->data);
        sprintf(topic_hum, "/%.*s/humidity", event->data_len, event->data);
        if (strcmp(rcv_topic, "/createScene") == 0) {
            ESP_LOGI(TAG_mqtt, "Creating scene");
            ESP_LOGI(TAG_mqtt, "Opening Non-Volatile Storage (NVS) handle... ");
            esp_err_t err = nvs_open("name", NVS_READWRITE, &my_handle);
            if (err != ESP_OK) {
                ESP_LOGI(TAG_mqtt, "Error (%s) opening NVS handle!\n", esp_err_to_name(err));
            } else {
                err = nvs_set_str(my_handle, "scene_name", rcv_mess);

                ESP_LOGI(TAG_mqtt, "Committing updates in NVS ... ");
                err = nvs_commit(my_handle);

                nvs_close(my_handle);
            }
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

void app_main(void)
{
    xTaskCreate(&watchDog, "WatchDog", 1024, NULL, 5, NULL);
    //Initialize NVS
    esp_err_t err = nvs_flash_init();
    if (err == ESP_ERR_NVS_NO_FREE_PAGES || err == ESP_ERR_NVS_NEW_VERSION_FOUND) {
      ESP_ERROR_CHECK(nvs_flash_erase());
      err = nvs_flash_init();
    }
    ESP_ERROR_CHECK(err);

    ESP_LOGI(TAG_Main, "ESP_WIFI_MODE_STA");
    wifi_init_sta();

    esp_mqtt_client_config_t mqtt_cfg = {
        .broker.address.uri = MQTT_ADDRESS,
    };

    esp_mqtt_client_handle_t client = esp_mqtt_client_init(&mqtt_cfg);

    esp_mqtt_client_register_event(client, ESP_EVENT_ANY_ID, mqtt_event_handler, NULL);
    esp_mqtt_client_start(client);

    vTaskDelay(1000 / portTICK_PERIOD_MS);

    ESP_LOGI(TAG_Main, "Opening Non-Volatile Storage (NVS) handle... ");
    err = nvs_open("name", NVS_READWRITE, &my_handle);
    if (err != ESP_OK) {
        ESP_LOGI(TAG_Main, "Error (%s) opening NVS handle!\n", esp_err_to_name(err));
    } else {
        // Read
        char scene[10];
        size_t len;
        err = nvs_get_str(my_handle, "scene_name", scene, &len);
        switch (err) {
            case ESP_OK:
                ESP_LOGI(TAG_Main, "Scene is = %s\n", scene);
                sprintf(topic_temp, "/%s/temperature", scene);
                sprintf(topic_hum, "/%s/humidity", scene);
                flag_ready = 1;
                break;
            case ESP_ERR_NVS_NOT_FOUND:
                ESP_LOGI(TAG_Main, "The value is not initialized yet!\n");
                break;
            default :
                ESP_LOGI(TAG_Main, "Error (%s) reading!\n", esp_err_to_name(err));
        }   

        nvs_close(my_handle);
    }
        
    esp_sleep_enable_timer_wakeup(600000000);

    float humidity;
    float temperature;

    char hum_mess[10];
    char temp_mess[10];


    if (flag_ready == 0) {
        esp_mqtt_client_subscribe(client, "/createScene", 0);
    }

    sht30_init(&sht30, I2C_PORT, SCL_PIN, SDA_PIN, SHT30_ADDRESS_DEF, I2C_SPEED, MAX_WAIT_TIME);

    while (1)
    {
        if(flag_ready) {
            sht30_single_shot(&sht30, Repeatability_High, ClockStretching_Enable);

            ESP_LOGI(TAG_Main, "Hum: %.1f Tmp: %.1f\n", humidity = sht30_read_humidity(&sht30), temperature = sht30_read_temperature_celsius(&sht30));

            ESP_LOGI(TAG_Main, "Publishing to mqtt.");
            sprintf(hum_mess, "%f", humidity);
            esp_mqtt_client_publish(client, topic_hum, hum_mess, 0, 1, 0);

            ESP_LOGI(TAG_Main, "Publishing to mqtt.");
            sprintf(temp_mess, "%f", temperature);
            esp_mqtt_client_publish(client, topic_temp, temp_mess, 0, 1, 0);
            
            vTaskDelay(5000 / portTICK_PERIOD_MS);

            ESP_LOGI(TAG_Main, "Going to sleep");

            esp_deep_sleep_start();
        }
        esp_mqtt_client_publish(client, "/ready", "ready for pairing", 0, 1, 0);
        ESP_LOGI(TAG_Main, "Ready for pairing");
        vTaskDelay(500 / portTICK_PERIOD_MS);
    }

}

