package com.francobm.magiccrates.managers;

import com.francobm.magiccrates.api.Crate;
import com.francobm.magiccrates.cache.PlayerData;
import com.francobm.magiccrates.utils.MCNotInstalledException;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class CratesManager {

    /**
     * Deletes player data from memory
     * @param player
     */
    public void removePlayerData(Player player) {
        throw new MCNotInstalledException();
    }

    /**
     * Gets the player from memory
     * @param player
     * @return {@link com.francobm.magiccrates.cache.PlayerData}
     */
    public PlayerData getPlayerData(Player player) {
        throw new MCNotInstalledException();
    }

    /**
     * Gets the registered crates from the server
     * @return registered server crates
     */
    public Map<String, Crate> getCrates() {
        throw new MCNotInstalledException();
    }

    /**
     * Checks if a player is in a world that is blacklisted.
     * @param player
     * @return true if the player is in a blacklisted world.
     */
    public boolean hasInBlackWorld(Player player) {
        throw new MCNotInstalledException();
    }

    /**
     * If you give it a valid key, then it will show the transition to the player.
     * @param player who will see the transition
     * @param itemKey that will define whether to show you the transition or not.
     * @return true if a transition was shown to the player
     */
    public boolean reclaimCrateByKey(Player player, ItemStack itemKey) {
        throw new MCNotInstalledException();
    }
}
