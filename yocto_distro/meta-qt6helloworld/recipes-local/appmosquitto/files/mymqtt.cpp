#include "mymqtt.h"

QString MyMQTT::temperature() const
{
    return m_temperature;
}

void MyMQTT::setTemperature(const QString &newTemperature)
{
    m_temperature = newTemperature;
    emit temperatureChanged();
}

QString MyMQTT::humidity() const
{
    return m_humidity;
}

void MyMQTT::setHumidity(const QString &newHumidity)
{
    m_humidity = newHumidity;
    emit humidityChanged();
}

MyMQTT::MyMQTT(QObject *parent)
    : QObject{parent}
{
    m_client = new QMqttClient();
}

void MyMQTT::handleMessage(const QByteArray &message, const QMqttTopicName &topic)
{
    qInfo() << topic.name();
    if (topic.name() == "/home/temperature") {
        setTemperature(QString::number(message.toDouble()));
    }
    else if (topic.name() == "/home/humidity") {
        setHumidity(QString::number(message.toDouble()));
    }
}

void MyMQTT::changeState(QMqttClient::ClientState state)
{
    qInfo() << state;
    if (state == 2) {
        auto subscription_t = m_client->subscribe(QMqttTopicFilter("/home/temperature"));
        if (!subscription_t) {
            qInfo() << "Not subscribed";
        }

        auto subscription_h = m_client->subscribe(QMqttTopicFilter("/home/humidity"));
        if (!subscription_h) {
            qInfo() << "Not subscribed";
        }
    }
}

void MyMQTT::hostnameChange(QString hostname)
{
    qInfo() << hostname;
}
