cmake_minimum_required(VERSION 3.16)

project(mosquittto VERSION 0.1 LANGUAGES CXX)

set(CMAKE_AUTOMOC ON)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

find_package(Qt6 6.2 REQUIRED COMPONENTS Quick)
find_package(Qt6 REQUIRED COMPONENTS Svg)
find_package(Qt6 REQUIRED COMPONENTS Mqtt)


qt_add_executable(appmosquittto
    main.cpp
)

qt_add_qml_module(appmosquittto
    URI mosquittto
    VERSION 1.0
    QML_FILES
        Main.qml
        SOURCES mymqtt.h mymqtt.cpp
        RESOURCES home.svg
        RESOURCES waterdrop.svg
        RESOURCES temperature.svg
        RESOURCES arrow.svg
        QML_FILES Quality.qml
        RESOURCES sevensegment.ttf
)

# Qt for iOS sets MACOSX_BUNDLE_GUI_IDENTIFIER automatically since Qt 6.1.
# If you are developing for iOS or macOS you should consider setting an
# explicit, fixed bundle identifier manually though.
set_target_properties(appmosquittto PROPERTIES
#    MACOSX_BUNDLE_GUI_IDENTIFIER com.example.appmosquittto
    MACOSX_BUNDLE_BUNDLE_VERSION ${PROJECT_VERSION}
    MACOSX_BUNDLE_SHORT_VERSION_STRING ${PROJECT_VERSION_MAJOR}.${PROJECT_VERSION_MINOR}
    MACOSX_BUNDLE TRUE
    WIN32_EXECUTABLE TRUE
)

target_link_libraries(appmosquittto
    PRIVATE Qt6::Quick
    Qt6::Mqtt
    Qt6::Svg
)

include(GNUInstallDirs)
install(TARGETS appmosquittto
    BUNDLE DESTINATION .
    LIBRARY DESTINATION ${CMAKE_INSTALL_LIBDIR}
    RUNTIME DESTINATION ${CMAKE_INSTALL_BINDIR}
)
