import QtQuick

Rectangle {
    width: 135
    height: 50

    Row {

        anchors.horizontalCenter: parent.horizontalCenter
        anchors.verticalCenter: parent.verticalCenter
        spacing: 5

        Rectangle {
            width: 40
            height: 40
            color: "#59d22d"
        }
        Rectangle {
            width: 40
            height: 40
            color: "#c3d52a"
        }
        Rectangle {
            width: 40
            height: 40
            color: "#943725"
        }
    }
}
