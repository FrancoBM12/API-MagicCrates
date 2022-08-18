package com.francobm.magiccrates.cache;

import com.francobm.magiccrates.utils.MCNotInstalledException;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Sound {

    /**
     * Get the id of this Sound
     * @return The id
     */
    public String getId() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the text of the sound
     * @return the sound
     */
    public String getSound() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the Volume of this Sound
     * @return The volume
     */
    public float getVolume() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the Pitch of this Sound
     * @return The pitch
     */
    public float getPitch() {
        throw new MCNotInstalledException();
    }

    /**
     * makes you listen to the sound of a specific player.
     * @param player The player
     */
    public void playSound(Player player) {
        throw new MCNotInstalledException();
    }

    /**
     * makes you listen to the sound of a specific location.
     * @param location The location
     */
    public void playSound(Location location) {
        throw new MCNotInstalledException();
    }
}
