package com.francobm.magiccrates.events;

import com.francobm.magiccrates.api.Crate;
import com.francobm.magiccrates.utils.MCNotInstalledException;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * The event is called when the player finishes the animation and is about to receive his rewards.
 * NOTE: It is not called when animations are skipped.
 */
public class PlayerExitCrateEvent extends PlayerEvent {

    public PlayerExitCrateEvent(Player who, Crate crate) {
        super(who);
    }

    /**
     * Returns the player's crate before completely exiting.
     * @return {@link Crate}
     */
    public Crate getCrate() {
        throw new MCNotInstalledException();
    }

    public static HandlerList getHandlerList() {
        throw new MCNotInstalledException();
    }

    @Override
    public HandlerList getHandlers() {
        throw new MCNotInstalledException();
    }
}
