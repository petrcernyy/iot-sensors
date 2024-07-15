SUMMARY = "QT QML Test Recipe"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "file://CMakeLists.txt  \
           file://main.cpp  \
           file://mymqtt.cpp  \
           file://mymqtt.h  \
           file://scene.cpp  \
           file://scene.h  \
           file://Main.qml  \
           file://SensorPage.qml  \
           file://home.svg  \
           file://sevensegment.ttf  \
           file://temperature.svg  \
           file://waterdrop.svg  \
           "

DEPENDS += "qtbase wayland qtdeclarative-native qtquick3d qtsvg qtscxml qtmqtt"

S = "${WORKDIR}"

inherit cmake
inherit qt6-cmake
