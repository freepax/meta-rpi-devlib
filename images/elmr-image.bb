SUMMARY = "A console development image with some C/C++ dev tools"
HOMEPAGE = "http://www.example.com"
LICENSE = "MIT"

IMAGE_FEATURES += "package-management splash"
IMAGE_LINGUAS = "en-us"

require ../../../meta-rpi/images/qt5-image.bb

ELMR_APPS = " \
    tree \
    yocto-hello-world \
    rpi-device-lib \
"

IMAGE_INSTALL += " \
    ${ELMR_APPS} \
"

export IMAGE_BASENAME = "elmr-image"
