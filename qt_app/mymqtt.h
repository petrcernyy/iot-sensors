#ifndef MYMQTT_H
#define MYMQTT_H

#include <QObject>
#include <QtMqtt/QMqttClient>
#include <QtMqtt/QMqttSubscription>
#include <QDebug>
#include "scene.h"

class MyMQTT : public QObject
{
    Q_OBJECT

    QStringList topics_temp;
    QStringList topics_hum;

    QString m_sceneName;

    QList<Scene*> scenes;

    int m_index;
    int m_currentIndex;

    Q_PROPERTY(QString sceneName READ sceneName WRITE setSceneName NOTIFY sceneNameChanged FINAL)
    Q_PROPERTY(int index READ index WRITE setIndex NOTIFY indexChanged FINAL)
    Q_PROPERTY(int currentIndex READ currentIndex WRITE setCurrentIndex NOTIFY currentIndexChanged FINAL)

public:
    QMqttClient *m_client;
public:
    explicit MyMQTT(QObject *parent = nullptr);

    int index() const;
    void setIndex(const int newIndex);

    int currentIndex() const;
    void setCurrentIndex(const int newIndex);

    QString sceneName() const;
    void setSceneName(const QString &newSceneName);

    Q_INVOKABLE Scene* getScene(int index);

    Q_INVOKABLE void setHostname(const QString &newHostname);
    Q_INVOKABLE void setPort(const int newPort);
    Q_INVOKABLE void connect(void);

public slots:
    void handleMessage(const QByteArray &message, const QMqttTopicName &topic);
    void changeState(QMqttClient::ClientState state);
    void hostnameChange(QString hostname);

signals:
    void sceneNameChanged();
    void indexChanged();
    void currentIndexChanged();
    void temperatureChanged();
    void humidityChanged();
};

#endif // MYMQTT_H
