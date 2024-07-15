#include <QGuiApplication>
#include <QQmlApplicationEngine>
#include <QQmlContext>
#include <QtMqtt/QMqttClient>
#include "mymqtt.h"

int main(int argc, char *argv[])
{
    QGuiApplication app(argc, argv);

    MyMQTT *mymqtta = new MyMQTT();

    QObject::connect(mymqtta->m_client, &QMqttClient::hostnameChanged, mymqtta, &MyMQTT::hostnameChange);
    QObject::connect(mymqtta->m_client, &QMqttClient::stateChanged, mymqtta, &MyMQTT::changeState);
    QObject::connect(mymqtta->m_client, &QMqttClient::messageReceived, mymqtta, &MyMQTT::handleMessage);

    mymqtta->m_client->setHostname("192.168.1.240");
    mymqtta->m_client->setPort(1883);

    mymqtta->m_client->connectToHost();

    QQmlApplicationEngine engine;

    QQmlContext *rootContext = engine.rootContext();

    rootContext->setContextProperty("_MyMQTT", mymqtta);

    const QUrl url(QStringLiteral("qrc:/mosquittto/Main.qml"));
    QObject::connect(
        &engine,
        &QQmlApplicationEngine::objectCreated,
        &app,
        [url](QObject *obj, const QUrl &objUrl) {
            if (!obj && url == objUrl)
                QCoreApplication::exit(-1);
        },
        Qt::QueuedConnection);
    engine.load(url);

    return app.exec();
}
