package com.francobm.magiccrates.events;

import com.francobm.magiccrates.api.Crate;
import com.francobm.magiccrates.utils.MCNotInstalledException;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * The event is called when the player opens a crate but the first animation has not yet started.
 * This event is cancellable but the key will not be returned to the player if cancelled.
 * NOTE: It is not called when animations are skipped.
 */
public class PlayerJoinCrateEvent extends PlayerEvent implements Cancellable {

    public PlayerJoinCrateEvent(Player who, Crate crate) {
        super(who);
    }

    /**
     * Returns the opening player's crate
     * @return {@link Crate}
     */
    public Crate getCrate() {
        throw new MCNotInstalledException();
    }

    @Override
    public boolean isCancelled() {
        throw new MCNotInstalledException();
    }

    @Override
    public void setCancelled(boolean cancelled) {
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
