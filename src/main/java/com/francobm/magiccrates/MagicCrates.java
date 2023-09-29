package com.francobm.magiccrates;

import com.francobm.magiccrates.managers.CratesManager;
import com.francobm.magiccrates.utils.MCNotInstalledException;

public class MagicCrates {

    public CratesManager getManager() {
        CratesManager cratesManager;
        throw new MCNotInstalledException();
    }

    public static MagicCrates getInstance() {
        throw new MCNotInstalledException();
    }
}
