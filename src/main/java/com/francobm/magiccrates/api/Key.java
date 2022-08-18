package com.francobm.magiccrates.api;

import com.francobm.magiccrates.utils.MCNotInstalledException;
import org.bukkit.inventory.ItemStack;

public class Key {

    /**
     * Get the name of this key.
     * @return The name
     */
    public String getKeyName() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the item from this key.
     * @return The item
     */
    public ItemStack getKeyItem() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the item name of this key.
     * @return The item name
     */
    public String getKeyItemName() {
        throw new MCNotInstalledException();
    }
}
