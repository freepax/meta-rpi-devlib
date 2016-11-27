#
# firmware_i2c library
#

DESCRIPTION = "firmware i2c  display library"
SECTION = "examples"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3da9cfbcb788c80a0384361b4de20420"

#FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "5c58ced22ee81f193d4b8e382697dd686189779a"
SRC_URI = "git://github.com/freepax/firmware_i2c.git"

S = "${WORKDIR}/git"

inherit cmake
