#include "mymqtt.h"

QString MyMQTT::sceneName() const
{
    return m_sceneName;
}

void MyMQTT::setSceneName(const QString &newSceneName)
{
    m_sceneName = newSceneName;
    emit sceneNameChanged();
}

Scene* MyMQTT::getScene(int index)
{
    return scenes[index];
}

void MyMQTT::setHostname(const QString &newHostname)
{
    m_client->setHostname(newHostname);
}

void MyMQTT::setPort(const int newPort)
{
    m_client->setPort(newPort);
}

void MyMQTT::connect()
{
    m_client->connectToHost();
}

int MyMQTT::index() const
{
    return m_index;
}

void MyMQTT::setIndex(const int newIndex)
{
    m_index = newIndex;
    emit indexChanged();
}

int MyMQTT::currentIndex() const
{
    return m_currentIndex;
}

void MyMQTT::setCurrentIndex(const int newCurrentIndex)
{
    m_currentIndex = newCurrentIndex;
    emit currentIndexChanged();
}

MyMQTT::MyMQTT(QObject *parent)
    : QObject{parent}
{
    m_index = 0;
    m_client = new QMqttClient();
}

void MyMQTT::handleMessage(const QByteArray &message, const QMqttTopicName &topic)
{
    qInfo() << topic.name();
    if (topic.name() == "/addScene") {
        setSceneName(message);

        QString name = QString(message);
        QString temp = "/" + name + "/temperature";
        QString hum = "/" + name + "/humidity";

        Scene *scene = new Scene(name);

        scenes.append(scene);
        qInfo() << scenes;

        auto subscription_t = m_client->subscribe(QMqttTopicFilter(temp));
        if (!subscription_t) {
            qInfo() << "Not subscribed";
        }

        auto subscription_h = m_client->subscribe(QMqttTopicFilter(hum));
        if (!subscription_h) {
            qInfo() << "Not subscribed";
        }
        int idx = index();
        idx++;
        qInfo() << idx;
        setIndex(idx);
    }
    for(int i = 0; i < scenes.length(); i++){
        QString temp = "/" + scenes[i]->name() + "/temperature";
        QString hum = "/" + scenes[i]->name() + "/humidity";
        if (topic.name() == temp) {
            qInfo() << "Setting temperature in " << scenes[i]->name() << " to " << QString::number(message.toDouble(), 'g', 4);
            scenes[i]->setTemperature(QString::number(message.toDouble(), 'g', 4));
            setCurrentIndex(i);
            emit temperatureChanged();
        }
        else if (topic.name() == hum) {
            qInfo() << "Setting humidity in " << scenes[i]->name() << " to " << QString::number(message.toDouble(), 'g', 4);
            scenes[i]->setHumidity(QString::number(message.toDouble(), 'g', 4));
            setCurrentIndex(i);
            emit humidityChanged();
        }
    }

}

void MyMQTT::changeState(QMqttClient::ClientState state)
{
    qInfo() << state;
    if (state == 2) {
        auto subscription = m_client->subscribe(QMqttTopicFilter("/addScene"));
        if (!subscription) {
            qInfo() << "Not subscribed";
        }
    }
}

void MyMQTT::hostnameChange(QString hostname)
{
    qInfo() << hostname;
}
