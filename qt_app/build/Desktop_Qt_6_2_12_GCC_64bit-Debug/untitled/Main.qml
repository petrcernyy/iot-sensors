import QtQuick 2.9
import QtQuick.Window 2.2
import QtQuick.Controls 2.4

Window {
    visible: true
    width: 480
    height: 800
    title: qsTr("Example")

    FontLoader {
        id: localfont
        source: "sevensegment.ttf"
    }

    Text {
        id: sceneName
        visible: false
        text: _MyMQTT.sceneName
    }

    property int curIndexWitouthZero: 0

    SwipeView {
        id: viewSwipe
        width: parent.width
        height: parent.height*0.9
        currentIndex: 0

        onCurrentIndexChanged: {
            curIndexWitouthZero = viewSwipe.currentIndex
            curIndexWitouthZero += 1
        }

        function addPage(page) {
            console.log("funzione addPage()")
            addItem(page)
            page.visible = true
        }
        function createPage(){
            var component = Qt.createComponent("SensorPage.qml");
            var page = component.createObject(viewSwipe,
                                              {"myText": sceneName.text}
                                              );
            return page
        }
    }
    PageIndicator {
        id: indicator
        interactive: true
        count: viewSwipe.count
        currentIndex: viewSwipe.currentIndex
        onCurrentIndexChanged: viewSwipe.currentIndex = currentIndex

        anchors.top: viewSwipe.bottom
        anchors.topMargin: parent.height * 0.05
        anchors.horizontalCenter: parent.horizontalCenter
    }

    Connections {
        target: _MyMQTT
        onIndexChanged: {
            console.log("New page")
            viewSwipe.addPage(viewSwipe.createPage())
        }
        onTemperatureChanged: {
            console.log(_MyMQTT.currentIndex);
            viewSwipe.itemAt(_MyMQTT.currentIndex).myTemp = _MyMQTT.getScene(_MyMQTT.currentIndex).temperature;
        }
        onHumidityChanged: {
            console.log(_MyMQTT.currentIndex);
            viewSwipe.itemAt(_MyMQTT.currentIndex).myHum = _MyMQTT.getScene(_MyMQTT.currentIndex).humidity;
        }
    }
}
