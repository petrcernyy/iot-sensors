#ifndef MYMQTT_H
#define MYMQTT_H

#include <QObject>
#include <QtMqtt/QMqttClient>
#include <QtMqtt/QMqttSubscription>
#include <QDebug>

class MyMQTT : public QObject
{
    Q_OBJECT

    QString m_temperature;
    QString m_humidity;

    Q_PROPERTY(QString temperature READ temperature WRITE setTemperature NOTIFY temperatureChanged FINAL)
    Q_PROPERTY(QString humidity READ humidity WRITE setHumidity NOTIFY humidityChanged FINAL)

public:
    QMqttClient *m_client;
public:
    explicit MyMQTT(QObject *parent = nullptr);

    QString temperature() const;
    void setTemperature(const QString &newTemperature);

    QString humidity() const;
    void setHumidity(const QString &newHumidity);

public slots:
    void handleMessage(const QByteArray &message, const QMqttTopicName &topic);
    void changeState(QMqttClient::ClientState state);
    void hostnameChange(QString hostname);

signals:
    void temperatureChanged();
    void humidityChanged();
};

#endif // MYMQTT_H
