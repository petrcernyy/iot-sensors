#include "scene.h"

Scene::Scene(QString &name, QObject *parent)
    : QObject{parent}
{
    m_name = name;
    qInfo() << this;
    m_temperature = "0";
    m_humidity = "0";
}

QString Scene::name() const
{
    return m_name;
}

void Scene::setName(const QString &newName)
{
    m_name = newName;
}

QString Scene::temperature() const
{
    return m_temperature;
}

void Scene::setTemperature(const QString &newTemperature)
{
    m_temperature = newTemperature;
    emit temperatureChanged();
}

QString Scene::humidity() const
{
    return m_humidity;
}

void Scene::setHumidity(const QString &newHumidity)
{
    m_humidity = newHumidity;
    emit humidityChanged();
}
