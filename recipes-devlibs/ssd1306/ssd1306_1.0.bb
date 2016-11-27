#
# ssd1306 i2c display library
#

DESCRIPTION = "ssd1306 i2c display library"
SECTION = "examples"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3da9cfbcb788c80a0384361b4de20420"

#FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "850581fec04fdfc422ca1a35c8709a15404e9e08"
SRC_URI = "git://github.com/freepax/ssd1306lib.git"

S = "${WORKDIR}/git"

DEPENDS = "firmware-i2c"

inherit cmake
