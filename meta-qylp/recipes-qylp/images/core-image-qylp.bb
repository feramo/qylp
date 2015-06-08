SUMMARY = "An image with lepton thermal camera and Qt support"

IMAGE_FEATURES += "package-management x11-base qt4-pkgs"

LICENSE = "MIT" 

inherit core-image distro_features_check qt4e

REQUIRED_DISTRO_FEATURES = "x11"
