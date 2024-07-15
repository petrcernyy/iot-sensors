import QtQuick 2.0
import "../"

Rectangle {
    id: rcg
    color: "white"

    property string myText: "Bedroom"
    property string myTemp: "0"
    property string myHum: "0"

    Image {
        id: homeIcon
        source: "home.svg"

        anchors.left: parent.left
        anchors.leftMargin: 50

        anchors.top: parent.top
        anchors.topMargin: 50
    }

    Rectangle {
        id: iconLine

        height: 2
        width: 380
        color: "black"

        anchors.left: homeIcon.left
        anchors.top: homeIcon.bottom

    }

    Text {
        id: sceneText
        text: myText
        font.pixelSize: 40
        font.family: localfont.font.family
        font.weight: localfont.font.weight

        anchors.top: iconLine.bottom
        anchors.topMargin: 10
        anchors.horizontalCenter: parent.horizontalCenter

    }

    Image {
        id: tempIcon
        source: "temperature.svg"

        anchors.verticalCenter: tempValue.verticalCenter
        anchors.left: iconLine.left
        anchors.leftMargin: 100
    }

    Text {
        id: tempValue
        text: myTemp
        //text: "35"
        font.pixelSize: 80
        font.family: localfont.font.family
        font.weight: localfont.font.weight

        anchors.top: iconLine.bottom
        anchors.topMargin: 150
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
        //text: _MyMQTT.humidity
        text: myHum
        font.pixelSize: 80
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
}
