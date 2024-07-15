# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Expose localhost to the world"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "MIT & ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c1f7b9d9922f18387ead183ffb68886 \
                    file://node_modules/wrap-ansi/license;md5=d5f2a6dd0192dcc7c833e50bb9017337 \
                    file://node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/get-caller-file/LICENSE.md;md5=d21aa422a43e9693d50143d612b58967 \
                    file://node_modules/ansi-regex/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/escalade/license;md5=1cb46128f91146188c0ded3a1c6144f3 \
                    file://node_modules/strip-ansi/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/follow-redirects/LICENSE;md5=2913574e921aefe1275cd5864b4f9b66 \
                    file://node_modules/y18n/LICENSE;md5=55e5f88040679148136545002139a8b1 \
                    file://node_modules/emoji-regex/LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987 \
                    file://node_modules/cliui/LICENSE.txt;md5=83623193d3051ca8068a89a455c699ca \
                    file://node_modules/color-name/LICENSE;md5=d301869b39e08b33665b7c4f16b8e41d \
                    file://node_modules/is-fullwidth-code-point/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/string-width/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/yargs/LICENSE;md5=ec88e65c7bb01732069f3ad6b09ac90d \
                    file://node_modules/yargs-parser/LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35 \
                    file://node_modules/ansi-styles/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/axios/LICENSE;md5=61ca8e74b70ea19443b95af4bd607999 \
                    file://node_modules/require-directory/LICENSE;md5=903997d26b12b72b43aa60018387bb90 \
                    file://node_modules/color-convert/LICENSE;md5=9bdadfc9fbb3ab8d5a6d591bdbd52811 \
                    file://package.json;md5=1526c1594dd1091ceb46b5809567864e \
                    file://node_modules/ansi-regex/package.json;md5=a23faa508e1750ce0af91a3f51c2053d \
                    file://node_modules/ansi-styles/package.json;md5=ab7a71ab9f6b46acda83106c5f34e6e3 \
                    file://node_modules/axios/package.json;md5=88f3eaac37f20cdfd6bbdbdd62d213b7 \
                    file://node_modules/cliui/package.json;md5=df820349e31469f44c42b2eeebb89a67 \
                    file://node_modules/color-convert/package.json;md5=370b0177fdb4368f0a688ffa48559ecf \
                    file://node_modules/color-name/package.json;md5=ef649e8b7be42bba6d4fa34aca7e126a \
                    file://node_modules/debug/package.json;md5=aae02be7e1a4e95d0b6ebe777a9f0085 \
                    file://node_modules/emoji-regex/package.json;md5=57308bb3048f9db51fb79d3354f5a06f \
                    file://node_modules/escalade/package.json;md5=1303545797532d2dfa03d3529348e3a2 \
                    file://node_modules/follow-redirects/package.json;md5=756c4de6d6824626317a3ed7b35a48a9 \
                    file://node_modules/get-caller-file/package.json;md5=1b4e6c1baf2c3673b9a7d1cc649ee66a \
                    file://node_modules/is-fullwidth-code-point/package.json;md5=7c2dfa1f539b955d64d6af55282e1d9e \
                    file://node_modules/ms/package.json;md5=b3ea7267a23f72028e774742792b114a \
                    file://node_modules/openurl/package.json;md5=9433ac9d81f877157ce4d4639a50ca8f \
                    file://node_modules/require-directory/package.json;md5=77d2cd39b67ccdf73bfc037d229cf0f8 \
                    file://node_modules/string-width/package.json;md5=9546c3afdec6c3ee9a51fbb9d614976f \
                    file://node_modules/strip-ansi/package.json;md5=6a0c65b4bd6c6b9cd068e2232eef50d9 \
                    file://node_modules/wrap-ansi/package.json;md5=0266e671b50376ca3271235fd8d0a756 \
                    file://node_modules/y18n/package.json;md5=7f3c1af814a0cc1361c21ea0e0af9a25 \
                    file://node_modules/yargs/package.json;md5=fbbf5871196ab0554b33cc7fa1333f2f \
                    file://node_modules/yargs-parser/package.json;md5=65c76bac7c25a7d31f49f0c98386dac1"

SRC_URI = " \
    npm://registry.npmjs.org/;package=localtunnel;version=${PV} \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    "

S = "${WORKDIR}/npm"

inherit npm

LICENSE_${PN} = "MIT"
LICENSE_${PN}-ansi-regex = "MIT"
LICENSE_${PN}-ansi-styles = "MIT"
LICENSE_${PN}-axios = "MIT"
LICENSE_${PN}-cliui = "ISC"
LICENSE_${PN}-color-convert = "MIT"
LICENSE_${PN}-color-name = "MIT"
LICENSE_${PN}-debug = "MIT"
LICENSE_${PN}-emoji-regex = "MIT"
LICENSE_${PN}-escalade = "MIT"
LICENSE_${PN}-follow-redirects = "MIT"
LICENSE_${PN}-get-caller-file = "ISC"
LICENSE_${PN}-is-fullwidth-code-point = "MIT"
LICENSE_${PN}-ms = "MIT"
LICENSE_${PN}-openurl = "Unknown"
LICENSE_${PN}-require-directory = "MIT"
LICENSE_${PN}-string-width = "MIT"
LICENSE_${PN}-strip-ansi = "MIT"
LICENSE_${PN}-wrap-ansi = "MIT"
LICENSE_${PN}-y18n = "ISC"
LICENSE_${PN}-yargs = "MIT"
LICENSE_${PN}-yargs-parser = "ISC"
