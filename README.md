# IoT Temperature Monitoring System

This project consists of an IoT system for monitoring temperature using ESP32 and Raspberry Pi. The project includes:

- **ESP32 Firmware**: A firmware to gather temperature data and send it via MQTT.
- **Node.js Web Application**: A backend and frontend web application to visualize data and control settings.
- **Yocto Layer**: Custom Yocto layer to compile a distribution for the Raspberry Pi.
- **Qt Application**: A graphical interface running on Raspberry Pi, providing real-time temperature display.

The ESP32 measures the temperature and communicates over MQTT with the Raspberry Pi, which acts as a server. The Raspberry Pi also hosts the Node.js web application and tunnels its localhost to allow remote access.

## Architecture Overview
![System Architecture](./images/system_architecture.png)

## Setup Instructions

### Prerequisites

1. ESP32-s2 development board
2. SHT30 temperature sensor
3. Raspberry Pi with a display

### Step 1: Clone the repository

1. Clone the git repository

`https://github.com/petrcernyy/iot-sensors.git`

### Step 2: Setup ESP32 Firmware

1. Open the directory with firmware
   
`cd esp32_sensor_fw`

2. Change the SSID and PASSWORD for wifi connection. Also change the ip of your MQTT broker inside ./main/iot_sensor.c

```
#define EXAMPLE_ESP_WIFI_SSID      "SSID"
#define EXAMPLE_ESP_WIFI_PASS      "PASS"

#define MQTT_ADDRESS                "mqtt://xxx.xxx.x.xx:xxxx"
```

3. Set target and build/flash

`idf.py set-target esp32-s2`/
`idf.py build`/
`idf.py flash`/

### Step 3: Compile yocto distribution

1. Copy your files inside your yocto directory

2. Create a new build

`source poky/oe-init-build-env build-app`

3. Add layers

`bitbake-layers add-layer ../meta-openembedded/meta-oe`/
`bitbake-layers add-layer ../meta-openembedded/meta-python`/
`bitbake-layers add-layer ../meta-openembedded/meta-networking`/
`bitbake-layers add-layer ../meta-openembedded/meta-networking`/
`bitbake-layers add-layer ../meta-qt6`/
`bitbake-layers add-layer ../meta-raspberrypi`/
`bitbake-layers add-layer ../meta-qt6helloworld/

4. Enable building of recipes inside local.conf

`sudo vim conf/local.conf`

Locate line/
`MACHINE ??= "qemux86-64`

and change it to /
`MACHINE = "raspberrypi4-64"`

then add this line/

`IMAGE_INSTALL_append += " qml qtsvg appuntitled mosquitto mosquitto-clients express socketio mqtt localtunnel"`

5. Build the distribution

`bitbake core-image-sato`

6. Flash the image to sdcard

Navigate to 

`cd tmp/deploy/images/raspberrypi4-64`

Here locate file core-image-sato-raspberrypi4-64-xxxxxxxxxx-rootfs.wiz.bz2 and use program balenaEtcher for flashing

### Step 3: 
