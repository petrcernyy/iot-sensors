import QtQuick
import QtQuick.Controls
import "../"

ApplicationWindow {
    width: 320
    height: 440
    visible: true
    title: qsTr("AirQuality")
    visibility: "FullScreen"

    FontLoader {
        id: localfont
        source: "sevensegment.ttf"
    }

    Rectangle {
        anchors.fill: parent
        color: "white"

        Image {
            id: homeIcon
            source: "home.svg"

            anchors.left: parent.left
            anchors.leftMargin: 20

            anchors.top: parent.top
            anchors.topMargin: 20
        }

        Rectangle {
            id: iconLine

            height: 2
            width: 280
            color: "black"

            anchors.left: homeIcon.left
            anchors.top: homeIcon.bottom
        }

        Image {
            id: tempIcon
            source: "temperature.svg"
            scale: 1

            anchors.verticalCenter: tempValue.verticalCenter
            anchors.left: iconLine.left
            anchors.leftMargin: 40
        }

        Text {
            id: tempValue
            text: _MyMQTT.temperature
            font.pixelSize: 60
            font.family: localfont.font.family
            font.weight: localfont.font.weight

            anchors.top: iconLine.bottom
            anchors.topMargin: 50
            anchors.left: tempIcon.right
            anchors.leftMargin: 50

            Text {
                id: tempUnit
                text: "°C"
                font.pixelSize: 30
                font.family: localfont.font.family
                font.weight: localfont.font.weight

                anchors.bottom: parent.bottom
                anchors.bottomMargin: 7
                anchors.left: parent.right
                anchors.leftMargin: 10
            }
        }


        Image {
            id: humIcon
            source: "waterdrop.svg"

            anchors.verticalCenter: humValue.verticalCenter
            anchors.horizontalCenter: tempIcon.horizontalCenter
        }

        Text {
            id: humValue
            text: _MyMQTT.humidity
            font.pixelSize: 60
            font.family: localfont.font.family
            font.weight: localfont.font.weight

            anchors.top: tempValue.bottom
            anchors.topMargin: 50
            anchors.horizontalCenter: tempValue.horizontalCenter

            Text {
                id: humUnit
                text: "%"
                font.pixelSize: 30
                font.family: localfont.font.family
                font.weight: localfont.font.weight

                anchors.bottom: parent.bottom
                anchors.bottomMargin: 7
                anchors.left: parent.right
                anchors.leftMargin: 10
            }
        }

        Quality {
            id: quality

            anchors.bottom: parent.bottom
            anchors.bottomMargin: 40
            anchors.horizontalCenter: parent.horizontalCenter

            Image {
                id: arrowIcon
                source: "arrow.svg"
                scale: 0.1

                anchors.bottom: parent.top
                anchors.bottomMargin: -80
                anchors.horizontalCenter: parent.horizontalCenter
            }

        }

    }
}
