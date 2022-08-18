package com.francobm.magiccrates.events;

import com.francobm.magiccrates.api.Animation;
import com.francobm.magiccrates.api.AnimationState;
import com.francobm.magiccrates.api.Crate;
import com.francobm.magiccrates.utils.MCNotInstalledException;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Event called when crate play an animation
 */
public class CrateAnimationEvent extends Event {

    public CrateAnimationEvent(Crate crate, Animation animation, AnimationState animationState) {
        throw new MCNotInstalledException();
    }

    /**
     * Get the animation state of the event.
     * @return The animation state
     */
    public AnimationState getAnimationState() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the crate of the event.
     * @return the crate
     */
    public Crate getCrate() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the animation of the event.
     * @return The animation
     */
    public Animation getAnimation() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the player of the event.
     * @return The player
     */
    public Player getPlayer() {
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
