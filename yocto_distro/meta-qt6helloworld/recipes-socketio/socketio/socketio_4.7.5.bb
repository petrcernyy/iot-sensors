# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "node.js realtime framework server"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   node_modules/@types/cookie/LICENSE
#   node_modules/@types/node/LICENSE
#   node_modules/@types/cors/LICENSE
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "MIT & Unknown"
LIC_FILES_CHKSUM = "file://LICENSE;md5=852d069fbb52f1d8ed1ac32fa4b9147c \
                    file://node_modules/cookie/LICENSE;md5=bc85b43b6f963e8ab3f88e63628448ca \
                    file://node_modules/ws/LICENSE;md5=7a4bd929a6c0e6951846d75e53fc9f51 \
                    file://node_modules/socket.io-adapter/LICENSE;md5=afbe5b2f47d5cf306759fe2d435b5ee0 \
                    file://node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/mime-db/LICENSE;md5=175b28b58359f8b4a969c9ab7c828445 \
                    file://node_modules/@socket.io/component-emitter/LICENSE;md5=c22e1612ebc02ae74b51d7abefe6d1f2 \
                    file://node_modules/vary/LICENSE;md5=13babc4f212ce635d68da544339c962b \
                    file://node_modules/debug/LICENSE;md5=d85a365580888e9ee0a01fb53e8e9bf0 \
                    file://node_modules/base64id/LICENSE;md5=abb57c73ecaa9ddaa151a4e424935b47 \
                    file://node_modules/engine.io-parser/LICENSE;md5=71ac7d5db2cad06182ea04cbc53178dd \
                    file://node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/object-assign/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/socket.io-parser/LICENSE;md5=afbe5b2f47d5cf306759fe2d435b5ee0 \
                    file://node_modules/@types/cookie/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/node/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/cors/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/cors/LICENSE;md5=947eb5e695dade432a500b12c510de85 \
                    file://node_modules/negotiator/LICENSE;md5=6417a862a5e35c17c904d9dda2cbd499 \
                    file://node_modules/accepts/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/engine.io/LICENSE;md5=c9f272e8d85e84d214436bc09de14478 \
                    file://package.json;md5=4a1f904e3cb0f6d84bfe468f8732f995 \
                    file://node_modules/@socket.io/component-emitter/package.json;md5=94f5bfaa8a3b0ef1613e850a998208c5 \
                    file://node_modules/@types/cookie/package.json;md5=e44dbac5fe2de6de4b4185d004f2b853 \
                    file://node_modules/@types/cors/package.json;md5=0e65f0428814756afbaea71a6ab5a1c0 \
                    file://node_modules/@types/node/package.json;md5=4f334da311dca9dc6a17a0bed1a12c90 \
                    file://node_modules/accepts/package.json;md5=32a15d6909fcae63e52d8664593d32d5 \
                    file://node_modules/base64id/package.json;md5=2895eacbc1a0762d80b0b1783bce4c75 \
                    file://node_modules/cookie/package.json;md5=9ffd5fc85fd41d22b897364b95a8f292 \
                    file://node_modules/cors/package.json;md5=c369e9fe8250b830e467361b042794bb \
                    file://node_modules/debug/package.json;md5=9eebfd87feae25b89e06df41490bd931 \
                    file://node_modules/engine.io/package.json;md5=44c4a4ab3d7dea33f9f8c28273f54826 \
                    file://node_modules/engine.io-parser/package.json;md5=85c4c1c952e72a6d196eb9e7304bf6cf \
                    file://node_modules/mime-db/package.json;md5=12c5cd5cfa1d4f45af207db1715d4b70 \
                    file://node_modules/mime-types/package.json;md5=7ad9a6119e3173ea667f1409fefba992 \
                    file://node_modules/ms/package.json;md5=b3ea7267a23f72028e774742792b114a \
                    file://node_modules/negotiator/package.json;md5=5d2bc8ae77831203c6d0ce3a17e599cf \
                    file://node_modules/object-assign/package.json;md5=2854c33ba575a9ebc613d1a617ece277 \
                    file://node_modules/socket.io-adapter/package.json;md5=61d52f82d1deb3d3bf584b2544f94444 \
                    file://node_modules/socket.io-parser/package.json;md5=44f40c11d44fb5400e9777857a87dcba \
                    file://node_modules/undici-types/package.json;md5=948d0d4b81c8a1a6722401dcba5edf7c \
                    file://node_modules/vary/package.json;md5=3577fc17c1b964af7cfe2c17c73f84f3 \
                    file://node_modules/ws/package.json;md5=df895fd3270c7516b01ba38d098e5379"

SRC_URI = " \
    npm://registry.npmjs.org/;package=socket.io;version=${PV} \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    "

S = "${WORKDIR}/npm"

inherit npm

LICENSE_${PN} = "MIT"
LICENSE_${PN}-socketio-component-emitter = "MIT"
LICENSE_${PN}-types-cookie = "Unknown"
LICENSE_${PN}-types-cors = "Unknown"
LICENSE_${PN}-types-node = "Unknown"
LICENSE_${PN}-accepts = "MIT"
LICENSE_${PN}-base64id = "MIT"
LICENSE_${PN}-cookie = "MIT"
LICENSE_${PN}-cors = "MIT"
LICENSE_${PN}-debug = "MIT"
LICENSE_${PN}-engineio = "MIT"
LICENSE_${PN}-engineio-parser = "MIT"
LICENSE_${PN}-mime-db = "MIT"
LICENSE_${PN}-mime-types = "MIT"
LICENSE_${PN}-ms = "MIT"
LICENSE_${PN}-negotiator = "MIT"
LICENSE_${PN}-object-assign = "MIT"
LICENSE_${PN}-socketio-adapter = "MIT"
LICENSE_${PN}-socketio-parser = "MIT"
LICENSE_${PN}-undici-types = "Unknown"
LICENSE_${PN}-vary = "MIT"
LICENSE_${PN}-ws = "MIT"
