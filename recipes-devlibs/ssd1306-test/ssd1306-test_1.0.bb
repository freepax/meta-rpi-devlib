#
# ssd1306 i2c display library test code
#

DESCRIPTION = "ssd1306 i2c display test software"
SECTION = "examples"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3da9cfbcb788c80a0384361b4de20420"

#FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "451c86c7930cda6d1a8ddbdd7082682efee78b1d"
SRC_URI = "git://github.com/freepax/ssd1306-test.git"

S = "${WORKDIR}/git"

DEPENDS = "ssd1306"
#RDEPENDS = "libssd1306"

inherit cmake
