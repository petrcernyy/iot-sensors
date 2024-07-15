/****************************************************************************
** Meta object code from reading C++ file 'mymqtt.h'
**
** Created by: The Qt Meta Object Compiler version 68 (Qt 6.2.12)
**
** WARNING! All changes made in this file will be lost!
*****************************************************************************/

#include <memory>
#include "../../../../mymqtt.h"
#include <QtCore/qbytearray.h>
#include <QtCore/qmetatype.h>
#if !defined(Q_MOC_OUTPUT_REVISION)
#error "The header file 'mymqtt.h' doesn't include <QObject>."
#elif Q_MOC_OUTPUT_REVISION != 68
#error "This file was generated using the moc from 6.2.12. It"
#error "cannot be used with the include files from this version of Qt."
#error "(The moc has changed too much.)"
#endif

QT_BEGIN_MOC_NAMESPACE
QT_WARNING_PUSH
QT_WARNING_DISABLE_DEPRECATED
struct qt_meta_stringdata_MyMQTT_t {
    uint offsetsAndSizes[42];
    char stringdata0[248];
};
#define QT_MOC_LITERAL(ofs, len) \
    uint(sizeof(qt_meta_stringdata_MyMQTT_t::offsetsAndSizes) + ofs), len 
static const qt_meta_stringdata_MyMQTT_t qt_meta_stringdata_MyMQTT = {
    {
        QT_MOC_LITERAL(0, 6),  // "MyMQTT"
        QT_MOC_LITERAL(7, 16),  // "sceneNameChanged"
        QT_MOC_LITERAL(24, 0),  // ""
        QT_MOC_LITERAL(25, 12),  // "indexChanged"
        QT_MOC_LITERAL(38, 19),  // "currentIndexChanged"
        QT_MOC_LITERAL(58, 18),  // "temperatureChanged"
        QT_MOC_LITERAL(77, 15),  // "humidityChanged"
        QT_MOC_LITERAL(93, 13),  // "handleMessage"
        QT_MOC_LITERAL(107, 7),  // "message"
        QT_MOC_LITERAL(115, 14),  // "QMqttTopicName"
        QT_MOC_LITERAL(130, 5),  // "topic"
        QT_MOC_LITERAL(136, 11),  // "changeState"
        QT_MOC_LITERAL(148, 24),  // "QMqttClient::ClientState"
        QT_MOC_LITERAL(173, 5),  // "state"
        QT_MOC_LITERAL(179, 14),  // "hostnameChange"
        QT_MOC_LITERAL(194, 8),  // "hostname"
        QT_MOC_LITERAL(203, 8),  // "getScene"
        QT_MOC_LITERAL(212, 6),  // "Scene*"
        QT_MOC_LITERAL(219, 5),  // "index"
        QT_MOC_LITERAL(225, 9),  // "sceneName"
        QT_MOC_LITERAL(235, 12)   // "currentIndex"
    },
    "MyMQTT\0sceneNameChanged\0\0indexChanged\0"
    "currentIndexChanged\0temperatureChanged\0"
    "humidityChanged\0handleMessage\0message\0"
    "QMqttTopicName\0topic\0changeState\0"
    "QMqttClient::ClientState\0state\0"
    "hostnameChange\0hostname\0getScene\0"
    "Scene*\0index\0sceneName\0currentIndex"
};
#undef QT_MOC_LITERAL

static const uint qt_meta_data_MyMQTT[] = {

 // content:
      10,       // revision
       0,       // classname
       0,    0, // classinfo
       9,   14, // methods
       3,   87, // properties
       0,    0, // enums/sets
       0,    0, // constructors
       0,       // flags
       5,       // signalCount

 // signals: name, argc, parameters, tag, flags, initial metatype offsets
       1,    0,   68,    2, 0x06,    4 /* Public */,
       3,    0,   69,    2, 0x06,    5 /* Public */,
       4,    0,   70,    2, 0x06,    6 /* Public */,
       5,    0,   71,    2, 0x06,    7 /* Public */,
       6,    0,   72,    2, 0x06,    8 /* Public */,

 // slots: name, argc, parameters, tag, flags, initial metatype offsets
       7,    2,   73,    2, 0x0a,    9 /* Public */,
      11,    1,   78,    2, 0x0a,   12 /* Public */,
      14,    1,   81,    2, 0x0a,   14 /* Public */,

 // methods: name, argc, parameters, tag, flags, initial metatype offsets
      16,    1,   84,    2, 0x02,   16 /* Public */,

 // signals: parameters
    QMetaType::Void,
    QMetaType::Void,
    QMetaType::Void,
    QMetaType::Void,
    QMetaType::Void,

 // slots: parameters
    QMetaType::Void, QMetaType::QByteArray, 0x80000000 | 9,    8,   10,
    QMetaType::Void, 0x80000000 | 12,   13,
    QMetaType::Void, QMetaType::QString,   15,

 // methods: parameters
    0x80000000 | 17, QMetaType::Int,   18,

 // properties: name, type, flags
      19, QMetaType::QString, 0x00015903, uint(0), 0,
      18, QMetaType::Int, 0x00015903, uint(1), 0,
      20, QMetaType::Int, 0x00015903, uint(2), 0,

       0        // eod
};

void MyMQTT::qt_static_metacall(QObject *_o, QMetaObject::Call _c, int _id, void **_a)
{
    if (_c == QMetaObject::InvokeMetaMethod) {
        auto *_t = static_cast<MyMQTT *>(_o);
        (void)_t;
        switch (_id) {
        case 0: _t->sceneNameChanged(); break;
        case 1: _t->indexChanged(); break;
        case 2: _t->currentIndexChanged(); break;
        case 3: _t->temperatureChanged(); break;
        case 4: _t->humidityChanged(); break;
        case 5: _t->handleMessage((*reinterpret_cast< std::add_pointer_t<QByteArray>>(_a[1])),(*reinterpret_cast< std::add_pointer_t<QMqttTopicName>>(_a[2]))); break;
        case 6: _t->changeState((*reinterpret_cast< std::add_pointer_t<QMqttClient::ClientState>>(_a[1]))); break;
        case 7: _t->hostnameChange((*reinterpret_cast< std::add_pointer_t<QString>>(_a[1]))); break;
        case 8: { Scene* _r = _t->getScene((*reinterpret_cast< std::add_pointer_t<int>>(_a[1])));
            if (_a[0]) *reinterpret_cast< Scene**>(_a[0]) = std::move(_r); }  break;
        default: ;
        }
    } else if (_c == QMetaObject::RegisterMethodArgumentMetaType) {
        switch (_id) {
        default: *reinterpret_cast<QMetaType *>(_a[0]) = QMetaType(); break;
        case 5:
            switch (*reinterpret_cast<int*>(_a[1])) {
            default: *reinterpret_cast<QMetaType *>(_a[0]) = QMetaType(); break;
            case 1:
                *reinterpret_cast<QMetaType *>(_a[0]) = QMetaType::fromType< QMqttTopicName >(); break;
            }
            break;
        case 6:
            switch (*reinterpret_cast<int*>(_a[1])) {
            default: *reinterpret_cast<QMetaType *>(_a[0]) = QMetaType(); break;
            case 0:
                *reinterpret_cast<QMetaType *>(_a[0]) = QMetaType::fromType< QMqttClient::ClientState >(); break;
            }
            break;
        }
    } else if (_c == QMetaObject::IndexOfMethod) {
        int *result = reinterpret_cast<int *>(_a[0]);
        {
            using _t = void (MyMQTT::*)();
            if (_t _q_method = &MyMQTT::sceneNameChanged; *reinterpret_cast<_t *>(_a[1]) == _q_method) {
                *result = 0;
                return;
            }
        }
        {
            using _t = void (MyMQTT::*)();
            if (_t _q_method = &MyMQTT::indexChanged; *reinterpret_cast<_t *>(_a[1]) == _q_method) {
                *result = 1;
                return;
            }
        }
        {
            using _t = void (MyMQTT::*)();
            if (_t _q_method = &MyMQTT::currentIndexChanged; *reinterpret_cast<_t *>(_a[1]) == _q_method) {
                *result = 2;
                return;
            }
        }
        {
            using _t = void (MyMQTT::*)();
            if (_t _q_method = &MyMQTT::temperatureChanged; *reinterpret_cast<_t *>(_a[1]) == _q_method) {
                *result = 3;
                return;
            }
        }
        {
            using _t = void (MyMQTT::*)();
            if (_t _q_method = &MyMQTT::humidityChanged; *reinterpret_cast<_t *>(_a[1]) == _q_method) {
                *result = 4;
                return;
            }
        }
    }
#ifndef QT_NO_PROPERTIES
    else if (_c == QMetaObject::ReadProperty) {
        auto *_t = static_cast<MyMQTT *>(_o);
        (void)_t;
        void *_v = _a[0];
        switch (_id) {
        case 0: *reinterpret_cast< QString*>(_v) = _t->sceneName(); break;
        case 1: *reinterpret_cast< int*>(_v) = _t->index(); break;
        case 2: *reinterpret_cast< int*>(_v) = _t->currentIndex(); break;
        default: break;
        }
    } else if (_c == QMetaObject::WriteProperty) {
        auto *_t = static_cast<MyMQTT *>(_o);
        (void)_t;
        void *_v = _a[0];
        switch (_id) {
        case 0: _t->setSceneName(*reinterpret_cast< QString*>(_v)); break;
        case 1: _t->setIndex(*reinterpret_cast< int*>(_v)); break;
        case 2: _t->setCurrentIndex(*reinterpret_cast< int*>(_v)); break;
        default: break;
        }
    } else if (_c == QMetaObject::ResetProperty) {
    } else if (_c == QMetaObject::BindableProperty) {
    }
#endif // QT_NO_PROPERTIES
}

const QMetaObject MyMQTT::staticMetaObject = { {
    QMetaObject::SuperData::link<QObject::staticMetaObject>(),
    qt_meta_stringdata_MyMQTT.offsetsAndSizes,
    qt_meta_data_MyMQTT,
    qt_static_metacall,
    nullptr,
qt_incomplete_metaTypeArray<qt_meta_stringdata_MyMQTT_t
, QtPrivate::TypeAndForceComplete<QString, std::true_type>, QtPrivate::TypeAndForceComplete<int, std::true_type>, QtPrivate::TypeAndForceComplete<int, std::true_type>, QtPrivate::TypeAndForceComplete<MyMQTT, std::true_type>, QtPrivate::TypeAndForceComplete<void, std::false_type>, QtPrivate::TypeAndForceComplete<void, std::false_type>, QtPrivate::TypeAndForceComplete<void, std::false_type>, QtPrivate::TypeAndForceComplete<void, std::false_type>, QtPrivate::TypeAndForceComplete<void, std::false_type>
, QtPrivate::TypeAndForceComplete<void, std::false_type>, QtPrivate::TypeAndForceComplete<const QByteArray &, std::false_type>, QtPrivate::TypeAndForceComplete<const QMqttTopicName &, std::false_type>, QtPrivate::TypeAndForceComplete<void, std::false_type>, QtPrivate::TypeAndForceComplete<QMqttClient::ClientState, std::false_type>, QtPrivate::TypeAndForceComplete<void, std::false_type>, QtPrivate::TypeAndForceComplete<QString, std::false_type>
, QtPrivate::TypeAndForceComplete<Scene *, std::false_type>, QtPrivate::TypeAndForceComplete<int, std::false_type>

>,
    nullptr
} };


const QMetaObject *MyMQTT::metaObject() const
{
    return QObject::d_ptr->metaObject ? QObject::d_ptr->dynamicMetaObject() : &staticMetaObject;
}

void *MyMQTT::qt_metacast(const char *_clname)
{
    if (!_clname) return nullptr;
    if (!strcmp(_clname, qt_meta_stringdata_MyMQTT.stringdata0))
        return static_cast<void*>(this);
    return QObject::qt_metacast(_clname);
}

int MyMQTT::qt_metacall(QMetaObject::Call _c, int _id, void **_a)
{
    _id = QObject::qt_metacall(_c, _id, _a);
    if (_id < 0)
        return _id;
    if (_c == QMetaObject::InvokeMetaMethod) {
        if (_id < 9)
            qt_static_metacall(this, _c, _id, _a);
        _id -= 9;
    } else if (_c == QMetaObject::RegisterMethodArgumentMetaType) {
        if (_id < 9)
            qt_static_metacall(this, _c, _id, _a);
        _id -= 9;
    }
#ifndef QT_NO_PROPERTIES
    else if (_c == QMetaObject::ReadProperty || _c == QMetaObject::WriteProperty
            || _c == QMetaObject::ResetProperty || _c == QMetaObject::BindableProperty
            || _c == QMetaObject::RegisterPropertyMetaType) {
        qt_static_metacall(this, _c, _id, _a);
        _id -= 3;
    }
#endif // QT_NO_PROPERTIES
    return _id;
}

// SIGNAL 0
void MyMQTT::sceneNameChanged()
{
    QMetaObject::activate(this, &staticMetaObject, 0, nullptr);
}

// SIGNAL 1
void MyMQTT::indexChanged()
{
    QMetaObject::activate(this, &staticMetaObject, 1, nullptr);
}

// SIGNAL 2
void MyMQTT::currentIndexChanged()
{
    QMetaObject::activate(this, &staticMetaObject, 2, nullptr);
}

// SIGNAL 3
void MyMQTT::temperatureChanged()
{
    QMetaObject::activate(this, &staticMetaObject, 3, nullptr);
}

// SIGNAL 4
void MyMQTT::humidityChanged()
{
    QMetaObject::activate(this, &staticMetaObject, 4, nullptr);
}
QT_WARNING_POP
QT_END_MOC_NAMESPACE
