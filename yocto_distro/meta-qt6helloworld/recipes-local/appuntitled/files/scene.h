#ifndef SCENE_H
#define SCENE_H

#include <QObject>
#include <QDebug>

class Scene : public QObject
{
    Q_OBJECT

    QString m_name;

    QString m_temperature;
    QString m_humidity;

    Q_PROPERTY(QString temperature READ temperature WRITE setTemperature NOTIFY temperatureChanged FINAL)
    Q_PROPERTY(QString humidity READ humidity WRITE setHumidity NOTIFY humidityChanged FINAL)
public:
    explicit Scene(QString &name, QObject *parent = nullptr);

    QString temperature() const;
    void setTemperature(const QString &newTemperature);

    QString humidity() const;
    void setHumidity(const QString &newHumidity);

    QString name() const;
    void setName(const QString &newName);

signals:
    void temperatureChanged();
    void humidityChanged();
};

#endif // SCENE_H
