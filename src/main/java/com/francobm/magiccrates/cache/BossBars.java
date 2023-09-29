package com.francobm.magiccrates.cache;

import com.francobm.magiccrates.utils.MCNotInstalledException;
import org.bukkit.boss.BossBar;

import java.util.Map;

public class BossBars {

    public Map<String, BossBar> getBossBars() {
        throw new MCNotInstalledException();
    }

    public BossBar getBossBar(String id) {
        throw new MCNotInstalledException();
    }
}
