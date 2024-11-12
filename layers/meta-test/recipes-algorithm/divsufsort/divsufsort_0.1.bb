SUMMARY = "divsufsort"
DESCRIPTION = "divsufsort"
LICENSE = "CLOSED"

SRC_URI = "git://github.com/y-256/libdivsufsort.git;branch=master;protocol=https;rev=82b01f764e342f1858d4473c17b56844aac9c12d"

S = "${WORKDIR}/git"
inherit cmake pkgconfig


