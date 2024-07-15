SUMMARY = "QT QML Test Recipe"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "file://CMakeLists.txt  \
           file://main.cpp  \
           file://Main.qml  \
           "

DEPENDS += "qtbase wayland qtdeclarative-native qtquick3d"

S = "${WORKDIR}"

inherit cmake
inherit qt6-cmake
