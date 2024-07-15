# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "A library for the MQTT protocol"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE.md
#   node_modules/balanced-match/LICENSE.md
#   node_modules/process-nextick-args/license.md
#   node_modules/readable-stream/LICENSE
#   node_modules/typedarray/LICENSE
#   node_modules/string_decoder/LICENSE
#   node_modules/ieee754/LICENSE
#   node_modules/websocket-stream/LICENSE
#   node_modules/fs.realpath/LICENSE
#   node_modules/help-me/node_modules/through2/LICENSE.md
#   node_modules/glob/LICENSE
#   node_modules/bl/LICENSE.md
#   node_modules/bl/node_modules/readable-stream/LICENSE
#   node_modules/mqtt-packet/LICENSE.md
#   node_modules/through2-filter/node_modules/through2/LICENSE.md
#   node_modules/split2/node_modules/readable-stream/LICENSE
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Unknown & MIT & ISC"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=261aa46f11e9a7bdbea1dea7eb8bcb6c \
                    file://node_modules/balanced-match/LICENSE.md;md5=7fa99ddc3424107350ca6e9a24552085 \
                    file://node_modules/es6-map/LICENSE;md5=8c48678fbd286186af08f3483ad30ba9 \
                    file://node_modules/duplexify/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/ws/LICENSE;md5=95833e8f03687308b0584a377b9e12b0 \
                    file://node_modules/remove-trailing-separator/license;md5=294c1c7712f9be26cef730b5ad95a6a5 \
                    file://node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/process-nextick-args/license.md;md5=216769dac98a78ec088ee7cc6fad1dfa \
                    file://node_modules/unc-path-regex/LICENSE;md5=e060235353cb686ae1695ec7db63cfbc \
                    file://node_modules/event-emitter/LICENSE;md5=12a2129052783ef689cde41f4d302e6b \
                    file://node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/typedarray/LICENSE;md5=6085b70b74c7dcf7df4e955725e3153d \
                    file://node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/pumpify/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/pumpify/node_modules/pump/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/buffer/LICENSE;md5=e49e579dbcc02cf1f699deec85fd96f0 \
                    file://node_modules/glob-stream/LICENSE;md5=59d5f6a97c4befff1e4f1c67abc598c2 \
                    file://node_modules/string_decoder/LICENSE;md5=14af51f8c0a6c6e400b53e18c6e5f85c \
                    file://node_modules/path-dirname/license;md5=83e325e26e7a045eef3df8d1082df8c0 \
                    file://node_modules/ext/LICENSE;md5=b2295e3bd4f48e9f3783c4c3f69b5004 \
                    file://node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/path-is-absolute/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/to-absolute-glob/LICENSE;md5=8a4b0e5fd41b2cf9072913a284384998 \
                    file://node_modules/json-stable-stringify-without-jsonify/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/inflight/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/es6-symbol/LICENSE;md5=72fe3ccd709da8a0341a5f50e2e7888c \
                    file://node_modules/reinterval/LICENSE;md5=c65ef22a386436c433298ca42418c200 \
                    file://node_modules/is-relative/LICENSE;md5=3d83ea4c8ec9b31d9ff2c82fa29beabb \
                    file://node_modules/base64-js/LICENSE;md5=ea9187ca93cdc4f71219d1675712e908 \
                    file://node_modules/is-absolute/LICENSE;md5=b2593528953061a799b5b34922f0064d \
                    file://node_modules/es5-ext/LICENSE;md5=017a22439ef974173a46deee61374650 \
                    file://node_modules/ieee754/LICENSE;md5=56c3be003027d64d24ca6b69a2612f2f \
                    file://node_modules/xtend/LICENSE;md5=66787c5cd698a0b30b358c7e30f500ca \
                    file://node_modules/stream-shift/LICENSE;md5=42014010547e55bd3bcac2fec8c45624 \
                    file://node_modules/debug/LICENSE;md5=d85a365580888e9ee0a01fb53e8e9bf0 \
                    file://node_modules/ordered-read-streams/LICENSE;md5=2c136e62d89cbaf1bb1aa0e6002c3c5b \
                    file://node_modules/unique-stream/LICENSE;md5=64386b1e25291dbfa6fc2a6631a8eef5 \
                    file://node_modules/end-of-stream/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/websocket-stream/LICENSE;md5=17c1dd792579df06dfb25f64c81968ec \
                    file://node_modules/es6-set/LICENSE;md5=20bee5e35407a529d3f5120b1210f58b \
                    file://node_modules/concat-map/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/concat-stream/LICENSE;md5=3ad90c134f824ddfcea611ee1fa567a8 \
                    file://node_modules/next-tick/LICENSE;md5=86d1f749528cbb61ade016a7f823ce94 \
                    file://node_modules/fs.realpath/LICENSE;md5=062470525c8e380f8567f665ef554d11 \
                    file://node_modules/help-me/LICENSE;md5=6c5e18034ed4abefcb9ac97254596680 \
                    file://node_modules/help-me/node_modules/through2/LICENSE.md;md5=86fc40a92fe89e4ec72daa6fab2f9c21 \
                    file://node_modules/commist/LICENSE;md5=3f047b8c72633e56a5d2bddc7feaa719 \
                    file://node_modules/is-unc-path/LICENSE;md5=78c705080a639d3bb4085a9d1bb22987 \
                    file://node_modules/glob-parent/LICENSE;md5=429b0fedc27562e9e8deba9a9585396d \
                    file://node_modules/brace-expansion/LICENSE;md5=a5df515ef062cc3affd8c0ae59c059ec \
                    file://node_modules/is-negated-glob/LICENSE;md5=d5d7b190ec11a5e3199c3b3b45cde690 \
                    file://node_modules/type/LICENSE;md5=0a559bcad718b97857ba3da88f8e78e5 \
                    file://node_modules/async-limiter/LICENSE;md5=4b83a79a0c223073786a52b5ece4619d \
                    file://node_modules/leven/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/buffer-from/LICENSE;md5=46513463e8f7d9eb671a243f0083b2c6 \
                    file://node_modules/glob/LICENSE;md5=c727d36f28f2762b1011dd483aa1a191 \
                    file://node_modules/pump/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/bl/LICENSE.md;md5=455bc3781a009cf9a615e8622138814c \
                    file://node_modules/bl/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/is-windows/LICENSE;md5=5fb5a7fdbcfa3640822ec69bd3ee86e7 \
                    file://node_modules/minimatch/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/util-deprecate/LICENSE;md5=b7c99ef4b0f3ad9911a52219947f8cf0 \
                    file://node_modules/esniff/LICENSE;md5=72fe3ccd709da8a0341a5f50e2e7888c \
                    file://node_modules/is-extglob/LICENSE;md5=97b255bb4707da164bfaf4e5c7b9f9ef \
                    file://node_modules/es6-iterator/LICENSE;md5=3a0e4b466225c131d23df6171d246447 \
                    file://node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/core-util-is/LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff \
                    file://node_modules/d/LICENSE;md5=72fe3ccd709da8a0341a5f50e2e7888c \
                    file://node_modules/mqtt-packet/LICENSE.md;md5=622e77e45833bb4f785aebc7e41c0bdb \
                    file://node_modules/extend/LICENSE;md5=33d9f7a91df276ec16aa941032ee1476 \
                    file://node_modules/is-glob/LICENSE;md5=fad3c8b9c04b365012f3d6821f2dda61 \
                    file://node_modules/through2-filter/LICENSE;md5=8636046213b5488606f3472d43049c99 \
                    file://node_modules/through2-filter/node_modules/through2/LICENSE.md;md5=86fc40a92fe89e4ec72daa6fab2f9c21 \
                    file://node_modules/split2/LICENSE;md5=a3b84061387696c9678867c878a6bbc3 \
                    file://node_modules/split2/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/ultron/LICENSE;md5=4310a14e1d911cc6e4b5a34dbcbeaddd \
                    file://package.json;md5=4e9422c827df17f233cc325bcf1af710 \
                    file://node_modules/async-limiter/package.json;md5=1023ed343652ddb4c1948df4c789fe8a \
                    file://node_modules/balanced-match/package.json;md5=fa13802cf9109f23db7cc107f33cbf0a \
                    file://node_modules/base64-js/package.json;md5=8c3c32ad06db4e10d96a32653de4f1c3 \
                    file://node_modules/bl/node_modules/readable-stream/package.json;md5=9c2127bf7f0075c3bf99edb27a77034c \
                    file://node_modules/bl/package.json;md5=facb4ebabe0584de5c3ab29596de13d0 \
                    file://node_modules/brace-expansion/package.json;md5=effd91994b1b7ddb8a33060ad4541e6a \
                    file://node_modules/buffer/package.json;md5=3220969a7bbdae1bc07082db98d43627 \
                    file://node_modules/buffer-from/package.json;md5=5d307ad7d2ccde25a82e944fb224ebe2 \
                    file://node_modules/callback-stream/package.json;md5=53d91ab1ea457e3694c3495823cf5ccc \
                    file://node_modules/commist/package.json;md5=97bbd3ffe608fa96bdfae7b687c16b42 \
                    file://node_modules/concat-map/package.json;md5=85d8a674998927862b17adef4aa6a7b1 \
                    file://node_modules/concat-stream/package.json;md5=61caf8dd4ec0cd0fe58d27f28dc499d1 \
                    file://node_modules/core-util-is/package.json;md5=ce4cfe45404dea29ac581e68ba998ecc \
                    file://node_modules/d/package.json;md5=6879ff6ca36ac292edb105c3413f2b92 \
                    file://node_modules/debug/package.json;md5=9eebfd87feae25b89e06df41490bd931 \
                    file://node_modules/duplexify/package.json;md5=0df7062a272713b8043c7e26c65cba28 \
                    file://node_modules/end-of-stream/package.json;md5=36be3e35e3740830415138528c4237d4 \
                    file://node_modules/es5-ext/package.json;md5=0d4f8b9df31cc1c73f3236a1ee2ebaa3 \
                    file://node_modules/es6-iterator/package.json;md5=6b01ff7f1a37f28e8c55914ddc7c9b28 \
                    file://node_modules/es6-map/package.json;md5=2d42d0dd003d649885120a53b6857133 \
                    file://node_modules/es6-set/package.json;md5=c846ed33604dbc5b17f51505c4bb59db \
                    file://node_modules/es6-symbol/package.json;md5=69658d5ebd003e929d68b3fc4873f785 \
                    file://node_modules/esniff/package.json;md5=a35576cf3e7221e0df51c5638fcc4c76 \
                    file://node_modules/event-emitter/package.json;md5=0dd11a662119aaf3db8638515040e77b \
                    file://node_modules/ext/package.json;md5=bc575f3f8d3fd3bf4b2e4794e25ba72f \
                    file://node_modules/extend/package.json;md5=5074ec873b4010df5203d20e73e65246 \
                    file://node_modules/fs.realpath/package.json;md5=3aa3d67ce378e330e293496dd3b9a506 \
                    file://node_modules/glob/package.json;md5=f3dafd17154522e1916560c13533b2fc \
                    file://node_modules/glob-parent/package.json;md5=04bf0952f710c774bd9c759b11998416 \
                    file://node_modules/glob-stream/package.json;md5=47584ff5fe8f5e5fb936923d3a137212 \
                    file://node_modules/help-me/node_modules/through2/package.json;md5=c584f7fcdc313c175710c330eff82712 \
                    file://node_modules/help-me/package.json;md5=d86d6925639e56170e500cdf83d34cd6 \
                    file://node_modules/ieee754/package.json;md5=c99ba1a776f9fbc9e23b4f0f7bfb7b0d \
                    file://node_modules/inflight/package.json;md5=85ba25624378c23e1ee9b33d3d103bf0 \
                    file://node_modules/inherits/package.json;md5=f73908dab55d4259f3ed052ce9fb2fbb \
                    file://node_modules/is-absolute/package.json;md5=adf23a50e92728422cc4c8f8b4f67624 \
                    file://node_modules/is-extglob/package.json;md5=90ad861bbbc1f6ee662d11dd78cdc2fd \
                    file://node_modules/is-glob/package.json;md5=71cd690e8d61d506b7386ca44e6a4405 \
                    file://node_modules/is-negated-glob/package.json;md5=77c3a1ad981bade28a4def248fe56565 \
                    file://node_modules/is-relative/package.json;md5=7b057b23a10fa1d9df473f65f65745a2 \
                    file://node_modules/is-unc-path/package.json;md5=91958b5b9765eca54085ec03d86bac4f \
                    file://node_modules/is-windows/package.json;md5=5a2ed52f501e3a4a772b50bf34c752eb \
                    file://node_modules/isarray/package.json;md5=a490f11007b2cc9d19c4a250592c2e71 \
                    file://node_modules/json-stable-stringify-without-jsonify/package.json;md5=69744d65822d7e582b6b611142564175 \
                    file://node_modules/leven/package.json;md5=9d393e0b49dad8fe3f0f57803c2620d5 \
                    file://node_modules/minimatch/package.json;md5=9f31a54ef78d345b4d57907429129cd7 \
                    file://node_modules/minimist/package.json;md5=e6feae58c61551b9ff51d4da975fcc61 \
                    file://node_modules/mqtt-packet/package.json;md5=da64cbbbfa31008c5d767a4356e5ebd1 \
                    file://node_modules/ms/package.json;md5=b3ea7267a23f72028e774742792b114a \
                    file://node_modules/next-tick/package.json;md5=6e507b5dbe62dd41ecf2f934b5eb69d9 \
                    file://node_modules/once/package.json;md5=afb6ea3bdcad6397e11a71615bd06e3b \
                    file://node_modules/ordered-read-streams/package.json;md5=93596fab51b8726c0e54e23f1f415a77 \
                    file://node_modules/path-dirname/package.json;md5=e9b8273ed2f66600f0a2f59e44bc6d1f \
                    file://node_modules/path-is-absolute/package.json;md5=ef6e018bdf67b82ab1285bc799b5367b \
                    file://node_modules/process-nextick-args/package.json;md5=6bd1fff965ff97b4aff54e6b4e382ed0 \
                    file://node_modules/pump/package.json;md5=aaae9cf98124b7abea552bfa6b4ec7d5 \
                    file://node_modules/pumpify/node_modules/pump/package.json;md5=cc3430e81098dc872172cf2f26c38eb0 \
                    file://node_modules/pumpify/package.json;md5=a91156cafd2dc43b5ba27c8a9d6246ed \
                    file://node_modules/readable-stream/package.json;md5=0be50d91213f5ad0e17c0b0c7f525d0b \
                    file://node_modules/reinterval/package.json;md5=c593e53b7f2250477c36754ad13e516e \
                    file://node_modules/remove-trailing-separator/package.json;md5=ba6eed8cddd45e58dfc64c382f54e24e \
                    file://node_modules/safe-buffer/package.json;md5=bd7ef6f38f0ba20882d2601bd3ecaf11 \
                    file://node_modules/split2/node_modules/readable-stream/package.json;md5=9c2127bf7f0075c3bf99edb27a77034c \
                    file://node_modules/split2/package.json;md5=7b67653baa4639408e4e5b32e3a4f6d8 \
                    file://node_modules/stream-shift/package.json;md5=99c400b54da79f3613c381e3f15bfaa4 \
                    file://node_modules/string_decoder/package.json;md5=4a56e8c1789fe3bc13c55f8fec7e3ce2 \
                    file://node_modules/through2-filter/node_modules/through2/package.json;md5=c584f7fcdc313c175710c330eff82712 \
                    file://node_modules/through2-filter/package.json;md5=a825c5f32c0be2db317774f23d4e7cbe \
                    file://node_modules/to-absolute-glob/package.json;md5=f2cb8277b0a58ca19ae2e30ccd3061f7 \
                    file://node_modules/type/package.json;md5=741dc72465ec096a1949bd3d62d6c031 \
                    file://node_modules/typedarray/package.json;md5=252085c44894a63cd58d8c343f2ba589 \
                    file://node_modules/ultron/package.json;md5=c1b3b63b9555895716d971f154ea8bda \
                    file://node_modules/unc-path-regex/package.json;md5=ce8dab00313733f52f6be99f46393afa \
                    file://node_modules/unique-stream/package.json;md5=9c1ef1faef868bd1daac446d7e6c452f \
                    file://node_modules/util-deprecate/package.json;md5=73e6c3ff1709538c921d13a75cae485d \
                    file://node_modules/websocket-stream/package.json;md5=b0a8d9464724dd32534e7ce20b56d968 \
                    file://node_modules/wrappy/package.json;md5=788804d507f3ed479ea7614fa7d3f1a5 \
                    file://node_modules/ws/package.json;md5=aa83910881d0feb554343094f5f6ba8c \
                    file://node_modules/xtend/package.json;md5=9a88dd08c469a5a8b2ea15f999bf5db8"

SRC_URI = " \
    npm://registry.npmjs.org/;package=mqtt;version=${PV} \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    "

S = "${WORKDIR}/npm"

inherit npm

LICENSE_${PN} = "Unknown"
LICENSE_${PN}-async-limiter = "MIT"
LICENSE_${PN}-balanced-match = "Unknown"
LICENSE_${PN}-base64-js = "MIT"
LICENSE_${PN}-bl-readable-stream = "Unknown"
LICENSE_${PN}-bl = "Unknown"
LICENSE_${PN}-brace-expansion = "MIT"
LICENSE_${PN}-buffer = "MIT"
LICENSE_${PN}-buffer-from = "MIT"
LICENSE_${PN}-callback-stream = "Unknown"
LICENSE_${PN}-commist = "MIT"
LICENSE_${PN}-concat-map = "MIT"
LICENSE_${PN}-concat-stream = "MIT"
LICENSE_${PN}-core-util-is = "MIT"
LICENSE_${PN}-d = "ISC"
LICENSE_${PN}-debug = "MIT"
LICENSE_${PN}-duplexify = "MIT"
LICENSE_${PN}-end-of-stream = "MIT"
LICENSE_${PN}-es5-ext = "ISC"
LICENSE_${PN}-es6-iterator = "MIT"
LICENSE_${PN}-es6-map = "MIT"
LICENSE_${PN}-es6-set = "ISC"
LICENSE_${PN}-es6-symbol = "ISC"
LICENSE_${PN}-esniff = "ISC"
LICENSE_${PN}-event-emitter = "MIT"
LICENSE_${PN}-ext = "ISC"
LICENSE_${PN}-extend = "MIT"
LICENSE_${PN}-fsrealpath = "Unknown"
LICENSE_${PN}-glob = "Unknown"
LICENSE_${PN}-glob-parent = "ISC"
LICENSE_${PN}-glob-stream = "MIT"
LICENSE_${PN}-help-me-through2 = "Unknown"
LICENSE_${PN}-help-me = "MIT"
LICENSE_${PN}-ieee754 = "Unknown"
LICENSE_${PN}-inflight = "ISC"
LICENSE_${PN}-inherits = "ISC"
LICENSE_${PN}-is-absolute = "MIT"
LICENSE_${PN}-is-extglob = "MIT"
LICENSE_${PN}-is-glob = "MIT"
LICENSE_${PN}-is-negated-glob = "MIT"
LICENSE_${PN}-is-relative = "MIT"
LICENSE_${PN}-is-unc-path = "MIT"
LICENSE_${PN}-is-windows = "MIT"
LICENSE_${PN}-isarray = "Unknown"
LICENSE_${PN}-json-stable-stringify-without-jsonify = "MIT"
LICENSE_${PN}-leven = "MIT"
LICENSE_${PN}-minimatch = "ISC"
LICENSE_${PN}-minimist = "MIT"
LICENSE_${PN}-mqtt-packet = "Unknown"
LICENSE_${PN}-ms = "MIT"
LICENSE_${PN}-next-tick = "ISC"
LICENSE_${PN}-once = "ISC"
LICENSE_${PN}-ordered-read-streams = "MIT"
LICENSE_${PN}-path-dirname = "MIT"
LICENSE_${PN}-path-is-absolute = "MIT"
LICENSE_${PN}-process-nextick-args = "Unknown"
LICENSE_${PN}-pump = "MIT"
LICENSE_${PN}-pumpify-pump = "MIT"
LICENSE_${PN}-pumpify = "MIT"
LICENSE_${PN}-readable-stream = "Unknown"
LICENSE_${PN}-reinterval = "MIT"
LICENSE_${PN}-remove-trailing-separator = "ISC"
LICENSE_${PN}-safe-buffer = "MIT"
LICENSE_${PN}-split2-readable-stream = "Unknown"
LICENSE_${PN}-split2 = "ISC"
LICENSE_${PN}-stream-shift = "MIT"
LICENSE_${PN}-stringdecoder = "Unknown"
LICENSE_${PN}-through2-filter-through2 = "Unknown"
LICENSE_${PN}-through2-filter = "MIT"
LICENSE_${PN}-to-absolute-glob = "MIT"
LICENSE_${PN}-type = "ISC"
LICENSE_${PN}-typedarray = "Unknown"
LICENSE_${PN}-ultron = "MIT"
LICENSE_${PN}-unc-path-regex = "MIT"
LICENSE_${PN}-unique-stream = "MIT"
LICENSE_${PN}-util-deprecate = "MIT"
LICENSE_${PN}-websocket-stream = "Unknown"
LICENSE_${PN}-wrappy = "ISC"
LICENSE_${PN}-ws = "MIT"
LICENSE_${PN}-xtend = "MIT"
