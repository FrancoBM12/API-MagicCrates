package com.francobm.magiccrates.api;

import com.francobm.magiccrates.cache.Sound;
import com.francobm.magiccrates.utils.MCNotInstalledException;
import org.bukkit.Location;

public class Reward {

    /**
     * Gets the waiting time to show the reward.
     * @return The timeToShow
     */
    public int getTimeToShow() {
        throw new MCNotInstalledException();
    }

    /**
     * Obtains the force with which this reward will be pushed out of the crate.
     * @return The force
     */
    public float getForce() {
        throw new MCNotInstalledException();
    }

    /**
     * gets the type of Reward Animation that has this reward set.
     * @return The Animation Reward
     */
    public AnimationReward getAnimation() {
        throw new MCNotInstalledException();
    }

    /**
     * gets the sound that this reward will use when leaving the crate.
     * @return the sound
     */
    public Sound getSound() {
        throw new MCNotInstalledException();
    }

    /**
     * Set a new reward animation for this reward.
     * @param animation The new Animation for this reward.
     */
    public void setAnimation(AnimationReward animation) {
        throw new MCNotInstalledException();
    }

    /**
     * Sets a new push force for this reward.
     * @param force The new force
     */
    public void setForce(float force) {
        throw new MCNotInstalledException();
    }

    /**
     * Sets a new sound for this reward.
     * @param sound The new sound
     */
    public void setSound(Sound sound) {
        throw new MCNotInstalledException();
    }

    /**
     * Set the new waiting time to show the reward
     * @param timeToShow The new timeToShow
     */
    public void setTimeToShow(int timeToShow) {
        throw new MCNotInstalledException();
    }

    /**
     * Get the sound that will act as a trigger sound for this reward, this sound will be heard before the crate is opened.
     * @return The Sort Sound
     */
    public Sound getSortSound() {
        throw new MCNotInstalledException();
    }

    /**
     * Sets the new sort sound.
     * @param sortSound The new sortSound
     */
    public void setSortSound(Sound sortSound) {
        throw new MCNotInstalledException();
    }

    /**
     * Get the duration of the sort, that is before the crate opens.
     * @return The duration
     */
    public int getSortDuration() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the sort interval
     * @return The new interval
     */
    public int getSortInterval() {
        throw new MCNotInstalledException();
    }

    /**
     * Set the sort interval
     * @param sortInterval The new interval
     */
    public void setSortInterval(int sortInterval) {
        throw new MCNotInstalledException();
    }

    /**
     * Set the sort duration
     * @param sortDuration The new sortDuration
     */
    public void setSortDuration(int sortDuration) {
        throw new MCNotInstalledException();
    }

    /**
     * Toggle the reward animation of this reward.
     */
    public void toggleAnimation() {
        throw new MCNotInstalledException();
    }
}
