package com.francobm.magiccrates.api;

import com.francobm.magiccrates.cache.Sound;
import com.francobm.magiccrates.utils.MCNotInstalledException;

import java.util.List;

/**
 * The Animation class works for Crates.
 */
public abstract class Animation {

    /**
     * play the animation
     */
    public abstract void playAnimation();

    /**
     * get the animation id
     * @return the animation id
     */
    public String getAnimationId() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the crate that is being used in this animation.
     * @return the crate
     */
    public Crate getCrate() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the speed of the animation.
     * @return the speed
     */
    public double getSpeed() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the in of the animation.
     * @return the in
     */
    public int getIn() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the out of the animation.
     * @return the out
     */
    public int getOut() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the duration of the animation.
     * @return the duration
     */
    public double getDuration() {
        throw new MCNotInstalledException();
    }

    /**
     * Check if this animation is already finished.
     * @return finished
     */
    public boolean isFinish() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the id of the animation.
     * @return the id
     */
    public String getId() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the sound of the animation.
     * @return the sound
     */
    public Sound getSound() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the name of the animation.
     * @return the name
     */
    public String getName() {
        throw new MCNotInstalledException();
    }

    /**
     * Get a clone of this class
     * @return the Animation;
     */
    public Animation getClone() {
        throw new MCNotInstalledException();
    }

    /**
     * Run commands from this animation.
     */
    protected void runCommands() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the commands of the animation.
     * @return the commands
     */
    public List<String> getCommands() {
        throw new MCNotInstalledException();
    }
}
