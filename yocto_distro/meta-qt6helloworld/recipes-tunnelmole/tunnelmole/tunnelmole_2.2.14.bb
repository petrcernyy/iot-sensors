# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Tunnelmole, an open source ngrok alternative. Instant public URLs for any http/https based application. Available as a command line application or as an NPM dependency for your code. Stable and maintained. Good test coverage. Works behind firewalls"
HOMEPAGE = "https://tunnelmole.com"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   node_modules/@sinclair/typebox/license
#   node_modules/jest-util/node_modules/@types/node/LICENSE
#   node_modules/@jest/types/node_modules/@types/node/LICENSE
#   node_modules/process-nextick-args/license.md
#   node_modules/readable-stream/LICENSE
#   node_modules/typedarray/LICENSE
#   node_modules/string_decoder/LICENSE
#   node_modules/source-map/LICENSE
#   node_modules/@types/node-persist/LICENSE
#   node_modules/@types/node-persist/node_modules/@types/node/LICENSE
#   node_modules/@types/deep-equal/LICENSE
#   node_modules/@types/ws/LICENSE
#   node_modules/@types/ws/node_modules/@types/node/LICENSE
#   node_modules/@types/istanbul-reports/LICENSE
#   node_modules/@types/node-localstorage/LICENSE
#   node_modules/@types/node-localstorage/node_modules/@types/node/LICENSE
#   node_modules/@types/is-number/LICENSE
#   node_modules/@types/istanbul-lib-coverage/LICENSE
#   node_modules/@types/istanbul-lib-report/LICENSE
#   node_modules/@types/commander/LICENSE
#   node_modules/@types/node-fetch/LICENSE
#   node_modules/@types/node-fetch/node_modules/@types/node/LICENSE
#   node_modules/@types/stack-utils/LICENSE
#   node_modules/@types/jest/LICENSE
#   node_modules/@types/yargs/LICENSE
#   node_modules/@types/validator/LICENSE
#   node_modules/@types/yargs-parser/LICENSE
#   node_modules/@types/source-map-support/LICENSE
#   node_modules/webidl-conversions/LICENSE.md
#   node_modules/validator/es/lib/isLicensePlate.js
#   node_modules/validator/lib/isLicensePlate.js
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "MIT & Unknown & ISC"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=9c5293d2e71f4a63bacee14e57947e64 \
                    file://node_modules/es-errors/LICENSE;md5=8fe23ea421aaf9f9d687709f6a6a09b7 \
                    file://node_modules/@sinclair/typebox/license;md5=14904f907f74a96574b2149eb939b31e \
                    file://node_modules/has-tostringtag/LICENSE;md5=a026b78b6909aa5e21d77709fb6b5156 \
                    file://node_modules/is-symbol/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/gopd/LICENSE;md5=8478c87d16770f6d32a4578c475d3930 \
                    file://node_modules/available-typed-arrays/LICENSE;md5=838b75dc6028daf3e04e57871b7ad3ed \
                    file://node_modules/jest-matcher-utils/LICENSE;md5=ae79e563b8a09c8fc37978f18dbaa640 \
                    file://node_modules/es-define-property/LICENSE;md5=8fe23ea421aaf9f9d687709f6a6a09b7 \
                    file://node_modules/jest-util/LICENSE;md5=ae79e563b8a09c8fc37978f18dbaa640 \
                    file://node_modules/jest-util/node_modules/@types/node/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/ci-info/LICENSE;md5=a951d4f63f1af9937e6af6d0cea34e22 \
                    file://node_modules/object-keys/LICENSE;md5=0026e638d7d5c5f2768864ce0074f8ad \
                    file://node_modules/deep-equal/LICENSE;md5=ec4e94fe7abda03e2e44a713b0908a07 \
                    file://node_modules/ws/LICENSE;md5=95833e8f03687308b0584a377b9e12b0 \
                    file://node_modules/stop-iteration-iterator/LICENSE;md5=06aae85028f50ba69e6f83b6c9402b26 \
                    file://node_modules/which-typed-array/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/toml/LICENSE;md5=9a8fc655afd9029b33af361e0bdea28a \
                    file://node_modules/is-bigint/LICENSE;md5=291be6f19f64188a89ffd5180aea06f7 \
                    file://node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/for-each/LICENSE;md5=726a37665a35c687bf935f1503efee20 \
                    file://node_modules/has-proto/LICENSE;md5=d237eac07663bde2409de740ba75ec97 \
                    file://node_modules/@jest/schemas/LICENSE;md5=ae79e563b8a09c8fc37978f18dbaa640 \
                    file://node_modules/@jest/expect-utils/LICENSE;md5=ae79e563b8a09c8fc37978f18dbaa640 \
                    file://node_modules/@jest/types/LICENSE;md5=ae79e563b8a09c8fc37978f18dbaa640 \
                    file://node_modules/@jest/types/node_modules/@types/node/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/process-nextick-args/license.md;md5=216769dac98a78ec088ee7cc6fad1dfa \
                    file://node_modules/write-file-atomic/LICENSE;md5=68705ba56afdf6710c9187ed9a9cdd03 \
                    file://node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/typedarray/LICENSE;md5=6085b70b74c7dcf7df4e955725e3153d \
                    file://node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/micromatch/LICENSE;md5=0f64900f8f30e53054962c9f1fc3205b \
                    file://node_modules/is-set/LICENSE;md5=c18cc44449ec61c93b216bf74e6c4fa4 \
                    file://node_modules/slide/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/combined-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/to-regex-range/LICENSE;md5=b561e0a423bedc9d9ca9c8c67d40abb9 \
                    file://node_modules/string_decoder/LICENSE;md5=14af51f8c0a6c6e400b53e18c6e5f85c \
                    file://node_modules/object-inspect/LICENSE;md5=288162f1d1bfa064f127f2b42d2a656f \
                    file://node_modules/picomatch/LICENSE;md5=abd0e25891525eb13d5a794f550a6ee4 \
                    file://node_modules/has-bigints/LICENSE;md5=375dc7ca936a14e9c29418d5263bd066 \
                    file://node_modules/has-symbols/LICENSE;md5=afee57a289508ed4df3456667778aaf6 \
                    file://node_modules/which-boxed-primitive/LICENSE;md5=375dc7ca936a14e9c29418d5263bd066 \
                    file://node_modules/set-function-length/LICENSE;md5=19283ee92f78c91154834571c1f05a94 \
                    file://node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/is-weakset/LICENSE;md5=c18cc44449ec61c93b216bf74e6c4fa4 \
                    file://node_modules/possible-typed-array-names/LICENSE;md5=8fe23ea421aaf9f9d687709f6a6a09b7 \
                    file://node_modules/is-boolean-object/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/react-is/LICENSE;md5=901f6cd9846257b3a9c69dbd0a49caf1 \
                    file://node_modules/mime-db/LICENSE;md5=175b28b58359f8b4a969c9ab7c828445 \
                    file://node_modules/set-function-name/LICENSE;md5=19283ee92f78c91154834571c1f05a94 \
                    file://node_modules/which-collection/LICENSE;md5=c18cc44449ec61c93b216bf74e6c4fa4 \
                    file://node_modules/object.assign/LICENSE;md5=2b439ca9e99134dee172a7cc6d989174 \
                    file://node_modules/delayed-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/jest-message-util/LICENSE;md5=ae79e563b8a09c8fc37978f18dbaa640 \
                    file://node_modules/define-data-property/LICENSE;md5=06aae85028f50ba69e6f83b6c9402b26 \
                    file://node_modules/side-channel/LICENSE;md5=375dc7ca936a14e9c29418d5263bd066 \
                    file://node_modules/node-localstorage/LICENSE.md;md5=c441460e1ba194c8216c69b7a7c29228 \
                    file://node_modules/proxy-from-env/LICENSE;md5=1dd031451af4b09bc10b26b0c06141e3 \
                    file://node_modules/diff-sequences/LICENSE;md5=ae79e563b8a09c8fc37978f18dbaa640 \
                    file://node_modules/xtend/LICENSE;md5=66787c5cd698a0b30b358c7e30f500ca \
                    file://node_modules/isarray/LICENSE;md5=a5df515ef062cc3affd8c0ae59c059ec \
                    file://node_modules/define-properties/LICENSE;md5=53ffc646fdb83e45279cfe7105e5157b \
                    file://node_modules/asynckit/LICENSE;md5=177bc287fb9558bf3ea50b440c1c86ff \
                    file://node_modules/is-number/LICENSE;md5=0f64900f8f30e53054962c9f1fc3205b \
                    file://node_modules/whatwg-url/LICENSE.txt;md5=5ab9113efe10eeab888f7502d1c2e894 \
                    file://node_modules/jest-diff/LICENSE;md5=ae79e563b8a09c8fc37978f18dbaa640 \
                    file://node_modules/call-bind/LICENSE;md5=0eb2c73daa0ecf037cbdf3d0bb0c98d5 \
                    file://node_modules/is-arguments/LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5 \
                    file://node_modules/nanoid/LICENSE;md5=237c21016e56a1ee4475a39fc00d1504 \
                    file://node_modules/streamsearch/LICENSE;md5=cbf7b3097b1484b7e6c118fc1d31f877 \
                    file://node_modules/is-date-object/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/follow-redirects/LICENSE;md5=2913574e921aefe1275cd5864b4f9b66 \
                    file://node_modules/has-property-descriptors/LICENSE;md5=d237eac07663bde2409de740ba75ec97 \
                    file://node_modules/is-map/LICENSE;md5=c18cc44449ec61c93b216bf74e6c4fa4 \
                    file://node_modules/expect/LICENSE;md5=ae79e563b8a09c8fc37978f18dbaa640 \
                    file://node_modules/braces/LICENSE;md5=0f64900f8f30e53054962c9f1fc3205b \
                    file://node_modules/type-is/LICENSE;md5=0afd201e48c7d095454eed4ac1184e40 \
                    file://node_modules/commander/LICENSE;md5=25851d4d10d6611a12d5571dab945a00 \
                    file://node_modules/concat-stream/LICENSE;md5=3ad90c134f824ddfcea611ee1fa567a8 \
                    file://node_modules/is-callable/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/is-string/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/picocolors/LICENSE;md5=8aabd5d21f92335888d962fb6ca980f8 \
                    file://node_modules/functions-have-names/LICENSE;md5=375dc7ca936a14e9c29418d5263bd066 \
                    file://node_modules/internal-slot/LICENSE;md5=375dc7ca936a14e9c29418d5263bd066 \
                    file://node_modules/color-name/LICENSE;md5=d301869b39e08b33665b7c4f16b8e41d \
                    file://node_modules/chalk/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/graceful-fs/LICENSE;md5=163972d49c2f7a3d3b687aeb48e9e3c9 \
                    file://node_modules/deepmerge/license.txt;md5=2a17013e56295fa960ab9eeba4d65f2a \
                    file://node_modules/append-field/LICENSE;md5=5c090f9df283eefdcea00b2f0766ca6c \
                    file://node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/object-assign/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/is-weakmap/LICENSE;md5=c18cc44449ec61c93b216bf74e6c4fa4 \
                    file://node_modules/source-map/LICENSE;md5=b1ca6dbc0075d56cbd9931a75566cd44 \
                    file://node_modules/node-fetch/LICENSE.md;md5=89fabe2fb10f72e48c2b3be506237d1e \
                    file://node_modules/slash/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/stack-utils/LICENSE.md;md5=054a50023e3f2656f333adbacbb65f47 \
                    file://node_modules/stack-utils/node_modules/escape-string-regexp/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/is-number-object/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/form-data/License;md5=7aa505292e2636a9e59d4d3f258f4819 \
                    file://node_modules/buffer-from/LICENSE;md5=46513463e8f7d9eb671a243f0083b2c6 \
                    file://node_modules/is-shared-array-buffer/LICENSE;md5=a026b78b6909aa5e21d77709fb6b5156 \
                    file://node_modules/media-typer/LICENSE;md5=c6e0ce1e688c5ff16db06b7259e9cd20 \
                    file://node_modules/busboy/LICENSE;md5=df3ad145c2acbfc4f246fa834a6675c7 \
                    file://node_modules/js-tokens/LICENSE;md5=1d63bea73a26ffaf5e964ce74d3b83a5 \
                    file://node_modules/array-buffer-byte-length/LICENSE;md5=03c1a46f1c5121c7eb2cd13d6cb56831 \
                    file://node_modules/object-is/LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5 \
                    file://node_modules/supports-color/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/multer/LICENSE;md5=039580279923334e9eaeb656c54e6039 \
                    file://node_modules/@types/node-persist/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/node-persist/node_modules/@types/node/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/deep-equal/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/ws/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/ws/node_modules/@types/node/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/istanbul-reports/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/node-localstorage/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/node-localstorage/node_modules/@types/node/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/is-number/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/istanbul-lib-coverage/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/istanbul-lib-report/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/commander/LICENSE;md5=b98fddd052bb2f5ddbcdbd417ffb26a8 \
                    file://node_modules/@types/node-fetch/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/node-fetch/node_modules/@types/node/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/stack-utils/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/jest/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/yargs/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/validator/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/yargs-parser/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/source-map-support/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/has-flag/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/get-intrinsic/LICENSE;md5=0eb2c73daa0ecf037cbdf3d0bb0c98d5 \
                    file://node_modules/tunnelmole/LICENSE.md;md5=9c5293d2e71f4a63bacee14e57947e64 \
                    file://node_modules/escape-string-regexp/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/util-deprecate/LICENSE;md5=b7c99ef4b0f3ad9911a52219947f8cf0 \
                    file://node_modules/webidl-conversions/LICENSE.md;md5=44d86433f305935cb0c3d3cd320e7a34 \
                    file://node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/validator/LICENSE;md5=f60f3cec847c930c52652164a0da939b \
                    file://node_modules/validator/es/lib/isLicensePlate.js;md5=f1526760d2f2212edf6e99405c0e5394 \
                    file://node_modules/validator/lib/isLicensePlate.js;md5=2ad05e43e3f3a04e1af6e702a0fab117 \
                    file://node_modules/pretty-format/LICENSE;md5=ae79e563b8a09c8fc37978f18dbaa640 \
                    file://node_modules/pretty-format/node_modules/ansi-styles/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/core-util-is/LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff \
                    file://node_modules/hasown/LICENSE;md5=19283ee92f78c91154834571c1f05a94 \
                    file://node_modules/function-bind/LICENSE;md5=e7417c1a8ad83f88bcac21ad440d48b2 \
                    file://node_modules/regexp.prototype.flags/LICENSE;md5=6009913822e586406a8cf459157e868a \
                    file://node_modules/ansi-styles/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/is-regex/LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5 \
                    file://node_modules/es-get-iterator/LICENSE;md5=375dc7ca936a14e9c29418d5263bd066 \
                    file://node_modules/axios/LICENSE;md5=a9f12edf7bc60d718b6ff862f62b3f1a \
                    file://node_modules/is-array-buffer/LICENSE;md5=db2b446565e5f8d6041d1c10fb307510 \
                    file://node_modules/fill-range/LICENSE;md5=0f64900f8f30e53054962c9f1fc3205b \
                    file://node_modules/jest-get-type/LICENSE;md5=ae79e563b8a09c8fc37978f18dbaa640 \
                    file://node_modules/@babel/helper-validator-identifier/LICENSE;md5=b1d0cd283a346e919abb3beeb018279d \
                    file://node_modules/@babel/code-frame/LICENSE;md5=b1d0cd283a346e919abb3beeb018279d \
                    file://node_modules/@babel/highlight/LICENSE;md5=b1d0cd283a346e919abb3beeb018279d \
                    file://node_modules/@babel/highlight/node_modules/color-name/LICENSE;md5=d301869b39e08b33665b7c4f16b8e41d \
                    file://node_modules/@babel/highlight/node_modules/chalk/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/@babel/highlight/node_modules/supports-color/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/@babel/highlight/node_modules/has-flag/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/@babel/highlight/node_modules/ansi-styles/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/@babel/highlight/node_modules/color-convert/LICENSE;md5=9bdadfc9fbb3ab8d5a6d591bdbd52811 \
                    file://node_modules/source-map-support/LICENSE.md;md5=f433e270f6b1d088c38b279d53048f5e \
                    file://node_modules/color-convert/LICENSE;md5=9bdadfc9fbb3ab8d5a6d591bdbd52811 \
                    file://package.json;md5=6b3e6eeff41085ba30d76ab4f1d370c3 \
                    file://node_modules/@babel/code-frame/package.json;md5=b91cadcb4784c4ad28d5916a5367db47 \
                    file://node_modules/@babel/helper-validator-identifier/package.json;md5=01f50cf223f5059ddbdda76dc91e9ffe \
                    file://node_modules/@babel/highlight/node_modules/ansi-styles/package.json;md5=50f97f15be9377b1110c7a68f76fff0f \
                    file://node_modules/@babel/highlight/node_modules/chalk/package.json;md5=a21f60da989d4bf1cd5396df6c638a98 \
                    file://node_modules/@babel/highlight/node_modules/color-convert/package.json;md5=51a202f6ab9b016f0f7219701f1f5e70 \
                    file://node_modules/@babel/highlight/node_modules/color-name/package.json;md5=7599aecb8597ca603c711d49a83dab59 \
                    file://node_modules/@babel/highlight/node_modules/has-flag/package.json;md5=73cc8d1e96c19ce85a7abb8f9468a86c \
                    file://node_modules/@babel/highlight/node_modules/supports-color/package.json;md5=79d88f702d689c72ebe1798d2853a96e \
                    file://node_modules/@babel/highlight/package.json;md5=533a780472586cde0f686c43999e4170 \
                    file://node_modules/@jest/expect-utils/package.json;md5=9699cf5cfd52034cb2d144e365aa170e \
                    file://node_modules/@jest/schemas/package.json;md5=05a806f9c71b4819ea8a9efa238e6bd2 \
                    file://node_modules/@jest/types/node_modules/@types/node/package.json;md5=4f334da311dca9dc6a17a0bed1a12c90 \
                    file://node_modules/@jest/types/package.json;md5=9e5b947bd4da84b75cb3a8d49a37ce47 \
                    file://node_modules/@sinclair/typebox/package.json;md5=008f6a524363a2113d3973ffe11248ea \
                    file://node_modules/@types/commander/package.json;md5=2fac3e71fe5b8279806c660290bbdc36 \
                    file://node_modules/@types/deep-equal/package.json;md5=9b91b6b98a4277e57fdb8f2c473bfafe \
                    file://node_modules/@types/is-number/package.json;md5=1d322664fc06bd0c1853601600d94143 \
                    file://node_modules/@types/istanbul-lib-coverage/package.json;md5=4b2fc714a021b02fd4512c59a3b984a1 \
                    file://node_modules/@types/istanbul-lib-report/package.json;md5=05edcf2a52bcded2dd95dfb37b1ddd22 \
                    file://node_modules/@types/istanbul-reports/package.json;md5=1b22b9c9bc29ebe64135a218eab31f4c \
                    file://node_modules/@types/jest/package.json;md5=d247f77bdecc0888ea7d6e9611cfd252 \
                    file://node_modules/@types/node-fetch/node_modules/@types/node/package.json;md5=4f334da311dca9dc6a17a0bed1a12c90 \
                    file://node_modules/@types/node-fetch/package.json;md5=255fad2f9debcca8b7937c00cb51c873 \
                    file://node_modules/@types/node-localstorage/node_modules/@types/node/package.json;md5=4f334da311dca9dc6a17a0bed1a12c90 \
                    file://node_modules/@types/node-localstorage/package.json;md5=5bb2d09eab66921f1ce77ad7925ff216 \
                    file://node_modules/@types/node-persist/node_modules/@types/node/package.json;md5=4f334da311dca9dc6a17a0bed1a12c90 \
                    file://node_modules/@types/node-persist/package.json;md5=624528ba1a57afc7a44df576f03b1c92 \
                    file://node_modules/@types/source-map-support/package.json;md5=e62c3cd98885a064d40bbeed68efa07a \
                    file://node_modules/@types/stack-utils/package.json;md5=51285e89240f30f5fd358ef7a153d315 \
                    file://node_modules/@types/validator/package.json;md5=3f0efb5ed3680aa998f529805490a930 \
                    file://node_modules/@types/ws/node_modules/@types/node/package.json;md5=4f334da311dca9dc6a17a0bed1a12c90 \
                    file://node_modules/@types/ws/package.json;md5=b0b2299981b04bb5805dc57da4d9cb58 \
                    file://node_modules/@types/yargs/package.json;md5=f0896310a185db82ada45916e89871a6 \
                    file://node_modules/@types/yargs-parser/package.json;md5=40836a05086cd7e9c7a1dd671afb36c5 \
                    file://node_modules/ansi-styles/package.json;md5=ab7a71ab9f6b46acda83106c5f34e6e3 \
                    file://node_modules/append-field/package.json;md5=c32cdcbb2318460adadc8efd177aa1b3 \
                    file://node_modules/array-buffer-byte-length/package.json;md5=b2986c4e86b01ed3b236d20f03d62a86 \
                    file://node_modules/asynckit/package.json;md5=e1fcbbcbd664b4b2966883624fbad801 \
                    file://node_modules/available-typed-arrays/package.json;md5=183bc153d71e3587c7a134a3fc9e5a8b \
                    file://node_modules/axios/package.json;md5=ebc880c8ed341febb00c2d8791c20847 \
                    file://node_modules/braces/package.json;md5=7a2d78a68012510f5a9496ddf8e03f16 \
                    file://node_modules/buffer-from/package.json;md5=5d307ad7d2ccde25a82e944fb224ebe2 \
                    file://node_modules/busboy/package.json;md5=41c891bc9c5d6336c658b5a05d3e45ac \
                    file://node_modules/call-bind/package.json;md5=7327c5e04c116460b3c73ee92292269a \
                    file://node_modules/chalk/package.json;md5=e9911c2278cd2d9d88d0328d1629b2e6 \
                    file://node_modules/ci-info/package.json;md5=d810aacc802adc34ba7202f36ad9d8a3 \
                    file://node_modules/color-convert/package.json;md5=370b0177fdb4368f0a688ffa48559ecf \
                    file://node_modules/color-name/package.json;md5=ef649e8b7be42bba6d4fa34aca7e126a \
                    file://node_modules/combined-stream/package.json;md5=089f95f5df2908028bdbbe545ad5c0e3 \
                    file://node_modules/commander/package.json;md5=559c22783d1b9bc3462653c0aedb7eb4 \
                    file://node_modules/concat-stream/package.json;md5=61caf8dd4ec0cd0fe58d27f28dc499d1 \
                    file://node_modules/core-util-is/package.json;md5=ce4cfe45404dea29ac581e68ba998ecc \
                    file://node_modules/deep-equal/package.json;md5=59310261092499d61c9371536dddd554 \
                    file://node_modules/deepmerge/package.json;md5=c205b1bc82eca22861a935e879251c74 \
                    file://node_modules/define-data-property/package.json;md5=05b9ba4536b59b74c4b3c95327787004 \
                    file://node_modules/define-properties/package.json;md5=8dd6450711eb96b9c39702df1645394d \
                    file://node_modules/delayed-stream/package.json;md5=cd5e299bb3405995d7e81ead42d4949d \
                    file://node_modules/diff-sequences/package.json;md5=589006d0cf4ceaa11a3589262dc0cc92 \
                    file://node_modules/es-define-property/package.json;md5=c4725fba887a7ff0ac3858d435a1b240 \
                    file://node_modules/es-errors/package.json;md5=7e6b784827a0aff2a05c343f8a53e88d \
                    file://node_modules/es-get-iterator/package.json;md5=ba6d106f81f46c1eb152bf8ece0661d1 \
                    file://node_modules/escape-string-regexp/package.json;md5=6050cf06c06dcb38dce670ff96b21aa9 \
                    file://node_modules/expect/package.json;md5=9d818d243fdc823812b6d92c4d3ef4ba \
                    file://node_modules/fill-range/package.json;md5=c466fb8d7614267f96f5a00a5b3490f4 \
                    file://node_modules/follow-redirects/package.json;md5=756c4de6d6824626317a3ed7b35a48a9 \
                    file://node_modules/for-each/package.json;md5=005a7ab296be8470eb16730e7a04e8b0 \
                    file://node_modules/form-data/package.json;md5=00dcee6f56b694a2ac0c60d509cfb152 \
                    file://node_modules/function-bind/package.json;md5=325c50acb9dd3d834589c1aeb318c9a8 \
                    file://node_modules/functions-have-names/package.json;md5=08e2c1019e1a7f78e179d4665d617e79 \
                    file://node_modules/get-intrinsic/package.json;md5=322602876e4a7e2716019566ca203f85 \
                    file://node_modules/gopd/package.json;md5=decfdb3ee3a3a8ac4460e083201ff8b2 \
                    file://node_modules/graceful-fs/package.json;md5=babc4604a4e9958a063e1941f873d11f \
                    file://node_modules/has-bigints/package.json;md5=bfd0704bd6085f4c274475ebae6ded12 \
                    file://node_modules/has-flag/package.json;md5=636dbe2c8d513ad850070def501122bf \
                    file://node_modules/has-property-descriptors/package.json;md5=510168f5c4c087586d843e93cc695783 \
                    file://node_modules/has-proto/package.json;md5=ccb4058e21eb78dd88d3a003dc3cc489 \
                    file://node_modules/has-symbols/package.json;md5=854e83356c304640e79edea88870cb14 \
                    file://node_modules/has-tostringtag/package.json;md5=a4ae7afd6f3599411eedf3ded7485363 \
                    file://node_modules/hasown/package.json;md5=e1b6e64cea1f71881fabb0759bac0d43 \
                    file://node_modules/imurmurhash/package.json;md5=feb3f37f4780f79e5fdb5ff0870f1057 \
                    file://node_modules/inherits/package.json;md5=f73908dab55d4259f3ed052ce9fb2fbb \
                    file://node_modules/internal-slot/package.json;md5=befb1bfd545feaa8fcb59d208a17ba51 \
                    file://node_modules/is-arguments/package.json;md5=9ebc941c421dbc1fcb935f9e38c68dcd \
                    file://node_modules/is-array-buffer/package.json;md5=4b788bd96fb5868cf6b635024e33ebce \
                    file://node_modules/is-bigint/package.json;md5=39994291e9656582d82f9958911c6b15 \
                    file://node_modules/is-boolean-object/package.json;md5=bb985a52e8686f466965ab409da000df \
                    file://node_modules/is-callable/package.json;md5=db1b5f99324828a2b1ff0cef5bd25dc1 \
                    file://node_modules/is-date-object/package.json;md5=8c10ca2e5a057ccdeaffe53bafceb2b8 \
                    file://node_modules/is-map/package.json;md5=90d5d91b6fbc64aa0700c0885bf7e326 \
                    file://node_modules/is-number/package.json;md5=41b5221636f534d987259e37635e1dd6 \
                    file://node_modules/is-number-object/package.json;md5=d85ced4905a460d5b2b5bfbc79438adb \
                    file://node_modules/is-regex/package.json;md5=308a8841e219cc70ec6aa142ceb4226f \
                    file://node_modules/is-set/package.json;md5=33d6a338d73e88fd446108751790b70c \
                    file://node_modules/is-shared-array-buffer/package.json;md5=2f4278b0f9cbe1f4f28c0351035e6cf6 \
                    file://node_modules/is-string/package.json;md5=c2d845e3353745c47ee864d57ac5edf4 \
                    file://node_modules/is-symbol/package.json;md5=94a4cbfd209b73c73034ac1a74852e4b \
                    file://node_modules/is-weakmap/package.json;md5=c4d28fa3e30ed1be52da7b2e21b4ad9f \
                    file://node_modules/is-weakset/package.json;md5=f16b26e3db31eb40a11d847ec8a8d0d2 \
                    file://node_modules/isarray/package.json;md5=7efcba14ed8a9ab09e4c277b21936b7a \
                    file://node_modules/jest-diff/package.json;md5=5442f0a66cb2dbfc2a0a819b14e97a77 \
                    file://node_modules/jest-get-type/package.json;md5=872c8d1d155f7026f0d0cf4a5e8ac900 \
                    file://node_modules/jest-matcher-utils/package.json;md5=227990d4e3b7c88b60503fc26baa4c4e \
                    file://node_modules/jest-message-util/package.json;md5=36982883aad1f32b45fcea460e97e148 \
                    file://node_modules/jest-util/node_modules/@types/node/package.json;md5=4f334da311dca9dc6a17a0bed1a12c90 \
                    file://node_modules/jest-util/package.json;md5=2750015c0c5569a9af5eb159d8cfa2a3 \
                    file://node_modules/js-tokens/package.json;md5=022ec03d76e85da58a8ad1134290dfdf \
                    file://node_modules/media-typer/package.json;md5=127ce4abeb265c6eef7b45540241ca91 \
                    file://node_modules/micromatch/package.json;md5=37eadb5f78316349e877621eb710b6f4 \
                    file://node_modules/mime-db/package.json;md5=12c5cd5cfa1d4f45af207db1715d4b70 \
                    file://node_modules/mime-types/package.json;md5=7ad9a6119e3173ea667f1409fefba992 \
                    file://node_modules/minimist/package.json;md5=e6feae58c61551b9ff51d4da975fcc61 \
                    file://node_modules/mkdirp/package.json;md5=65a9c81d4f8abb72f51e7ea6a7f02957 \
                    file://node_modules/multer/package.json;md5=4e44c8d6ad71da24be3226b99592d1f4 \
                    file://node_modules/nanoid/package.json;md5=caeeaa70c9b04dc3352af80585805e44 \
                    file://node_modules/node-fetch/package.json;md5=d6398137aa8b02dd6759c1e497bd91de \
                    file://node_modules/node-localstorage/package.json;md5=ee1ad819353073492d6f06a249556571 \
                    file://node_modules/object-assign/package.json;md5=2854c33ba575a9ebc613d1a617ece277 \
                    file://node_modules/object-inspect/package.json;md5=eec6ab0f3d7a28b7a4ca175188ef23b4 \
                    file://node_modules/object-is/package.json;md5=46a4d0a84b889135db78b02f30e21156 \
                    file://node_modules/object-keys/package.json;md5=f008c51545b8133eebae07e2046d241f \
                    file://node_modules/object.assign/package.json;md5=925f7312e9ee5ae129c61926226554e0 \
                    file://node_modules/picocolors/package.json;md5=9d540d9c494dfa73897b4e5fbdd006aa \
                    file://node_modules/picomatch/package.json;md5=cb3d8904aa6b3b3dada336f96d4d80c3 \
                    file://node_modules/possible-typed-array-names/package.json;md5=0fe6b16793c56ad1bf8fc44da2d2b630 \
                    file://node_modules/pretty-format/node_modules/ansi-styles/package.json;md5=b9a76b37dc587ac5b4e1f98cbe82d073 \
                    file://node_modules/pretty-format/package.json;md5=e73a97366e3389a039b4a50f25d5e6f6 \
                    file://node_modules/process-nextick-args/package.json;md5=6bd1fff965ff97b4aff54e6b4e382ed0 \
                    file://node_modules/proxy-from-env/package.json;md5=139513ecf001aebc9b79a839274a30ca \
                    file://node_modules/react-is/package.json;md5=656f198d9b53c7a16b535dabaff79c85 \
                    file://node_modules/readable-stream/node_modules/isarray/package.json;md5=a490f11007b2cc9d19c4a250592c2e71 \
                    file://node_modules/readable-stream/package.json;md5=0be50d91213f5ad0e17c0b0c7f525d0b \
                    file://node_modules/regexp.prototype.flags/package.json;md5=6e57d2e601a77d8ab1424dccac270397 \
                    file://node_modules/safe-buffer/package.json;md5=bd7ef6f38f0ba20882d2601bd3ecaf11 \
                    file://node_modules/set-function-length/package.json;md5=d5c44d4cc2d418c8a4248912b241ea03 \
                    file://node_modules/set-function-name/package.json;md5=7a728057e3a1f2394de066d8a9880761 \
                    file://node_modules/side-channel/package.json;md5=9d06d3c21ae37a4600c5685baad644fa \
                    file://node_modules/slash/package.json;md5=da2cf538726a98a560e80ad1c876035d \
                    file://node_modules/slide/package.json;md5=ee0233987ed268585eb486bd842677d3 \
                    file://node_modules/source-map/package.json;md5=5f7feb368962c3130c5accf22ffd047c \
                    file://node_modules/source-map-support/package.json;md5=82a79198fa51b5a0924d409a6997335a \
                    file://node_modules/stack-utils/node_modules/escape-string-regexp/package.json;md5=5480cda71be16961c520f64a79b35eac \
                    file://node_modules/stack-utils/package.json;md5=a672e13e5652decc37e56012486b5329 \
                    file://node_modules/stop-iteration-iterator/package.json;md5=177905313273296a28758bf526dab3b7 \
                    file://node_modules/streamsearch/package.json;md5=5a305662b0eef900cec0f752a53a02d5 \
                    file://node_modules/string_decoder/package.json;md5=4a56e8c1789fe3bc13c55f8fec7e3ce2 \
                    file://node_modules/supports-color/package.json;md5=9bd5f75e8324cc8e0b633c59f1c4b60b \
                    file://node_modules/to-regex-range/package.json;md5=31ccdd7dc49cec37d8982159ba163275 \
                    file://node_modules/toml/package.json;md5=8c4ed0f0d5b33e7a57653a39268bad99 \
                    file://node_modules/tr46/package.json;md5=36ce158498fb4f35c9a42edb60665bbe \
                    file://node_modules/tunnelmole/package.json;md5=6b3e6eeff41085ba30d76ab4f1d370c3 \
                    file://node_modules/type-is/package.json;md5=ffa244d8a6f745a081a0cdde026879c9 \
                    file://node_modules/typedarray/package.json;md5=252085c44894a63cd58d8c343f2ba589 \
                    file://node_modules/undici-types/package.json;md5=948d0d4b81c8a1a6722401dcba5edf7c \
                    file://node_modules/util-deprecate/package.json;md5=73e6c3ff1709538c921d13a75cae485d \
                    file://node_modules/validator/package.json;md5=1a824499476d9c5b0798ff312794b6b9 \
                    file://node_modules/webidl-conversions/package.json;md5=d7bd86551914eb9227e095c120c44a20 \
                    file://node_modules/whatwg-url/package.json;md5=6e30b7bcedf322ac0d987b6a02d1918a \
                    file://node_modules/which-boxed-primitive/package.json;md5=15162a8fd256d3b885a5df0213cf5f27 \
                    file://node_modules/which-collection/package.json;md5=835c7410dcc69c26de1387ee9b5b0c6d \
                    file://node_modules/which-typed-array/package.json;md5=a12761773432b713e3ab69e444949b63 \
                    file://node_modules/write-file-atomic/package.json;md5=7073326a76a91fe23a3a5bd14628cd1d \
                    file://node_modules/ws/package.json;md5=58c31aaa6cf24ca70d80107b33ccde45 \
                    file://node_modules/xtend/package.json;md5=9a88dd08c469a5a8b2ea15f999bf5db8"

SRC_URI = " \
    npm://registry.npmjs.org/;package=tunnelmole;version=${PV} \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    "

S = "${WORKDIR}/npm"

inherit npm

LICENSE_${PN} = "MIT"
LICENSE_${PN}-babel-code-frame = "MIT"
LICENSE_${PN}-babel-helper-validator-identifier = "MIT"
LICENSE_${PN}-babel-highlight-ansi-styles = "MIT"
LICENSE_${PN}-babel-highlight-chalk = "MIT"
LICENSE_${PN}-babel-highlight-color-convert = "MIT"
LICENSE_${PN}-babel-highlight-color-name = "MIT"
LICENSE_${PN}-babel-highlight-has-flag = "MIT"
LICENSE_${PN}-babel-highlight-supports-color = "MIT"
LICENSE_${PN}-babel-highlight = "MIT"
LICENSE_${PN}-jest-expect-utils = "MIT"
LICENSE_${PN}-jest-schemas = "MIT"
LICENSE_${PN}-jest-types-types-node = "Unknown"
LICENSE_${PN}-jest-types = "MIT"
LICENSE_${PN}-sinclair-typebox = "Unknown"
LICENSE_${PN}-types-commander = "Unknown"
LICENSE_${PN}-types-deep-equal = "Unknown"
LICENSE_${PN}-types-is-number = "Unknown"
LICENSE_${PN}-types-istanbul-lib-coverage = "Unknown"
LICENSE_${PN}-types-istanbul-lib-report = "Unknown"
LICENSE_${PN}-types-istanbul-reports = "Unknown"
LICENSE_${PN}-types-jest = "Unknown"
LICENSE_${PN}-types-node-fetch-types-node = "Unknown"
LICENSE_${PN}-types-node-fetch = "Unknown"
LICENSE_${PN}-types-node-localstorage-types-node = "Unknown"
LICENSE_${PN}-types-node-localstorage = "Unknown"
LICENSE_${PN}-types-node-persist-types-node = "Unknown"
LICENSE_${PN}-types-node-persist = "Unknown"
LICENSE_${PN}-types-source-map-support = "Unknown"
LICENSE_${PN}-types-stack-utils = "Unknown"
LICENSE_${PN}-types-validator = "Unknown"
LICENSE_${PN}-types-ws-types-node = "Unknown"
LICENSE_${PN}-types-ws = "Unknown"
LICENSE_${PN}-types-yargs = "Unknown"
LICENSE_${PN}-types-yargs-parser = "Unknown"
LICENSE_${PN}-ansi-styles = "MIT"
LICENSE_${PN}-append-field = "MIT"
LICENSE_${PN}-array-buffer-byte-length = "MIT"
LICENSE_${PN}-asynckit = "MIT"
LICENSE_${PN}-available-typed-arrays = "MIT"
LICENSE_${PN}-axios = "MIT"
LICENSE_${PN}-braces = "MIT"
LICENSE_${PN}-buffer-from = "MIT"
LICENSE_${PN}-busboy = "MIT"
LICENSE_${PN}-call-bind = "MIT"
LICENSE_${PN}-chalk = "MIT"
LICENSE_${PN}-ci-info = "MIT"
LICENSE_${PN}-color-convert = "MIT"
LICENSE_${PN}-color-name = "MIT"
LICENSE_${PN}-combined-stream = "MIT"
LICENSE_${PN}-commander = "MIT"
LICENSE_${PN}-concat-stream = "MIT"
LICENSE_${PN}-core-util-is = "MIT"
LICENSE_${PN}-deep-equal = "MIT"
LICENSE_${PN}-deepmerge = "MIT"
LICENSE_${PN}-define-data-property = "MIT"
LICENSE_${PN}-define-properties = "MIT"
LICENSE_${PN}-delayed-stream = "MIT"
LICENSE_${PN}-diff-sequences = "MIT"
LICENSE_${PN}-es-define-property = "MIT"
LICENSE_${PN}-es-errors = "MIT"
LICENSE_${PN}-es-get-iterator = "MIT"
LICENSE_${PN}-escape-string-regexp = "MIT"
LICENSE_${PN}-expect = "MIT"
LICENSE_${PN}-fill-range = "MIT"
LICENSE_${PN}-follow-redirects = "MIT"
LICENSE_${PN}-for-each = "MIT"
LICENSE_${PN}-form-data = "MIT"
LICENSE_${PN}-function-bind = "MIT"
LICENSE_${PN}-functions-have-names = "MIT"
LICENSE_${PN}-get-intrinsic = "MIT"
LICENSE_${PN}-gopd = "MIT"
LICENSE_${PN}-graceful-fs = "ISC"
LICENSE_${PN}-has-bigints = "MIT"
LICENSE_${PN}-has-flag = "MIT"
LICENSE_${PN}-has-property-descriptors = "MIT"
LICENSE_${PN}-has-proto = "MIT"
LICENSE_${PN}-has-symbols = "MIT"
LICENSE_${PN}-has-tostringtag = "MIT"
LICENSE_${PN}-hasown = "MIT"
LICENSE_${PN}-imurmurhash = "Unknown"
LICENSE_${PN}-inherits = "ISC"
LICENSE_${PN}-internal-slot = "MIT"
LICENSE_${PN}-is-arguments = "MIT"
LICENSE_${PN}-is-array-buffer = "MIT"
LICENSE_${PN}-is-bigint = "MIT"
LICENSE_${PN}-is-boolean-object = "MIT"
LICENSE_${PN}-is-callable = "MIT"
LICENSE_${PN}-is-date-object = "MIT"
LICENSE_${PN}-is-map = "MIT"
LICENSE_${PN}-is-number = "MIT"
LICENSE_${PN}-is-number-object = "MIT"
LICENSE_${PN}-is-regex = "MIT"
LICENSE_${PN}-is-set = "MIT"
LICENSE_${PN}-is-shared-array-buffer = "MIT"
LICENSE_${PN}-is-string = "MIT"
LICENSE_${PN}-is-symbol = "MIT"
LICENSE_${PN}-is-weakmap = "MIT"
LICENSE_${PN}-is-weakset = "MIT"
LICENSE_${PN}-isarray = "MIT"
LICENSE_${PN}-jest-diff = "MIT"
LICENSE_${PN}-jest-get-type = "MIT"
LICENSE_${PN}-jest-matcher-utils = "MIT"
LICENSE_${PN}-jest-message-util = "MIT"
LICENSE_${PN}-jest-util-types-node = "Unknown"
LICENSE_${PN}-jest-util = "MIT"
LICENSE_${PN}-js-tokens = "MIT"
LICENSE_${PN}-media-typer = "MIT"
LICENSE_${PN}-micromatch = "MIT"
LICENSE_${PN}-mime-db = "MIT"
LICENSE_${PN}-mime-types = "MIT"
LICENSE_${PN}-minimist = "MIT"
LICENSE_${PN}-mkdirp = "MIT"
LICENSE_${PN}-multer = "MIT"
LICENSE_${PN}-nanoid = "MIT"
LICENSE_${PN}-node-fetch = "MIT"
LICENSE_${PN}-node-localstorage = "MIT"
LICENSE_${PN}-object-assign = "MIT"
LICENSE_${PN}-object-inspect = "MIT"
LICENSE_${PN}-object-is = "MIT"
LICENSE_${PN}-object-keys = "MIT"
LICENSE_${PN}-objectassign = "MIT"
LICENSE_${PN}-picocolors = "ISC"
LICENSE_${PN}-picomatch = "MIT"
LICENSE_${PN}-possible-typed-array-names = "MIT"
LICENSE_${PN}-pretty-format-ansi-styles = "MIT"
LICENSE_${PN}-pretty-format = "MIT"
LICENSE_${PN}-process-nextick-args = "Unknown"
LICENSE_${PN}-proxy-from-env = "MIT"
LICENSE_${PN}-react-is = "MIT"
LICENSE_${PN}-readable-stream-isarray = "Unknown"
LICENSE_${PN}-readable-stream = "Unknown"
LICENSE_${PN}-regexpprototypeflags = "MIT"
LICENSE_${PN}-safe-buffer = "MIT"
LICENSE_${PN}-set-function-length = "MIT"
LICENSE_${PN}-set-function-name = "MIT"
LICENSE_${PN}-side-channel = "MIT"
LICENSE_${PN}-slash = "MIT"
LICENSE_${PN}-slide = "ISC"
LICENSE_${PN}-source-map = "Unknown"
LICENSE_${PN}-source-map-support = "MIT"
LICENSE_${PN}-stack-utils-escape-string-regexp = "MIT"
LICENSE_${PN}-stack-utils = "MIT"
LICENSE_${PN}-stop-iteration-iterator = "MIT"
LICENSE_${PN}-streamsearch = "MIT"
LICENSE_${PN}-stringdecoder = "Unknown"
LICENSE_${PN}-supports-color = "MIT"
LICENSE_${PN}-to-regex-range = "MIT"
LICENSE_${PN}-toml = "MIT"
LICENSE_${PN}-tr46 = "Unknown"
LICENSE_${PN}-tunnelmole = "MIT"
LICENSE_${PN}-type-is = "MIT"
LICENSE_${PN}-typedarray = "Unknown"
LICENSE_${PN}-undici-types = "Unknown"
LICENSE_${PN}-util-deprecate = "MIT"
LICENSE_${PN}-validator = "MIT Unknown"
LICENSE_${PN}-webidl-conversions = "Unknown"
LICENSE_${PN}-whatwg-url = "MIT"
LICENSE_${PN}-which-boxed-primitive = "MIT"
LICENSE_${PN}-which-collection = "MIT"
LICENSE_${PN}-which-typed-array = "MIT"
LICENSE_${PN}-write-file-atomic = "ISC"
LICENSE_${PN}-ws = "MIT"
LICENSE_${PN}-xtend = "MIT"
