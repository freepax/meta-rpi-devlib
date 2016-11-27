#
# bmp180 i2c pressure sensor library
#

DESCRIPTION = "bmp180 i2c pressure sensor library"
SECTION = "examples"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3da9cfbcb788c80a0384361b4de20420"

#FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "479f5b3777cfcb2572240f2f05d2ecae48d554e7"
SRC_URI = "git://github.com/freepax/bmp180lib.git"

S = "${WORKDIR}/git"

DEPENDS = "firmware-i2c"

inherit cmake
