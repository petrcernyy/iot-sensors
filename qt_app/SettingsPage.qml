import QtQuick 2.0
import QtQuick.Controls
import "../"

Rectangle {
    id: rcg
    color: "white"

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
        text: "Settings"
        font.pixelSize: 40
        font.family: localfont.font.family
        font.weight: localfont.font.weight

        anchors.top: iconLine.bottom
        anchors.topMargin: 10
        anchors.horizontalCenter: parent.horizontalCenter

    }

    Text {
        id: mqttLabel
        text: "Broker IP:"
        font.pixelSize: 30
        font.family: localfont.font.family
        font.weight: localfont.font.weight

        anchors.top: sceneText.bottom
        anchors.topMargin: 40
        anchors.left: iconLine.left
    }

    Rectangle {
        id: mqttIP
        border.color: "green"
        width: 380
        height: 50
        smooth: true
        clip: true
        radius: 4

        anchors.top: mqttLabel.bottom
        anchors.topMargin: 10
        anchors.left: mqttLabel.left

        TextInput {
            id: mqttIP_Text
            anchors.fill: parent
            anchors.margins: 2
            font.pixelSize: parent.height - 10
        }
    }

    Text {
        id: portLabel
        text: "Broker Port:"
        font.pixelSize: 30
        font.family: localfont.font.family
        font.weight: localfont.font.weight

        anchors.top: mqttIP.bottom
        anchors.topMargin: 40
        anchors.left: iconLine.left
    }

    Rectangle {
        id: mqttPort
        border.color: "green"
        width: 150
        height: 50
        smooth: true
        clip: true
        radius: 4

        anchors.top: portLabel.bottom
        anchors.topMargin: 10
        anchors.left: portLabel.left

        TextInput {
            id: mqttPort_Text
            anchors.fill: parent
            anchors.margins: 2
            font.pixelSize: parent.height - 10
        }
    }

    Button {
        id: connectButton
        width: 100
        height: 50
        text: "Connect"

        anchors.bottom: parent.bottom
        anchors.bottomMargin: 50
        anchors.horizontalCenter: parent.horizontalCenter

        onClicked: {
            console.log("Connect clicked");
            _MyMQTT.setHostname(mqttIP_Text.text);
            _MyMQTT.setPort(mqttPort_Text.text);
            _MyMQTT.connect();
        }
    }


}
