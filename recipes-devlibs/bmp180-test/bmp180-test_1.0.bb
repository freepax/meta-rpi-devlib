#
# bmp180 i2c test code
#

DESCRIPTION = "bmp180 i2c pressure sensor test software"
SECTION = "examples"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3da9cfbcb788c80a0384361b4de20420"

#FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "50dc0beb3da6cf8ef3af6281a5d9fe48e911812c"
SRC_URI = "git://github.com/freepax/bmp180-test.git"

S = "${WORKDIR}/git"

DEPENDS = "bmp180"

inherit cmake
