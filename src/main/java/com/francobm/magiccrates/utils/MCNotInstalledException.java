package com.francobm.magiccrates.utils;

public class MCNotInstalledException extends UnsupportedOperationException {
    public MCNotInstalledException() {
        super("Error: Magic Crates is not installed, please install it to use this API.");
    }
}
