package com.francobm.magiccrates.api;

import com.francobm.magiccrates.cache.ItemReward;
import com.francobm.magiccrates.cache.Locations;
import com.francobm.magiccrates.utils.MCNotInstalledException;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Map;
import java.util.Set;

public abstract class Crate {

    /**
     * Get the id of this Crate.
     * @return The id
     */
    public String getId() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the key to open this Crate.
     * @return The key
     */
    public Key getKey() {
        throw new MCNotInstalledException();
    }

    /**
     * Get a map of all rewards registered for this Crate.
     * @return The map of all rewards
     */
    public Map<String, ItemReward> getItemRewards() {
        throw new MCNotInstalledException();
    }

    /**
     * Get a reward from the reward map using the reward id.
     * @param id the reward Id
     * @return The reward with the given id.
     */
    public ItemReward getItemReward(String id) {
        throw new MCNotInstalledException();
    }

    /**
     * Check if the crate is from ModelEngine.
     * @return is a model of ModelEngine?
     */
    public boolean isMeg() {
        throw new MCNotInstalledException();
    }

    /**
     * Check if the crate is from ItemsAdder.
     * @return is a CustomEntity of ItemsAdder?
     */
    public boolean isIA() {
        throw new MCNotInstalledException();
    }

    /**
     * Check if the crate is from Vanilla.
     * @return is a simple Chest?
     */
    public boolean isDefault() {
        throw new MCNotInstalledException();
    }

    /**
     * Gets the list of animations that were registered for this Crate.
     * @return The list of animations.
     */
    public Map<String, Animation> getAnimations() {
        throw new MCNotInstalledException();
    }

    /**
     * The model id for this Crate.
     * @return The model id
     */
    public String getModel() {
        throw new MCNotInstalledException();
    }

    /**
     * Spawn a crate at a specific location for a specific player.
     * @param location the location
     * @param player the player
     */
    public abstract void spawnModel(Location location, Player player);

    /**
     * Get the current animation running on the Crate.
     * @return The current animation
     */
    public Animation getCurrentAnimation() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the list of animations that are waiting to be run
     * @return The animations waiting
     */
    public Set<Animation> getQueueAnim() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the name of this Crate.
     * @return The name
     */
    public String getName() {
        throw new MCNotInstalledException();
    }

    /**
     * Runs an animation from the animations registered for this Crate.
     * @param id the animation id
     */
    public void playAnimation(String id) {
        throw new MCNotInstalledException();
    }

    /**
     * Get a clone of this crate
     * @return the clone
     */
    public Crate getClone() {
        throw new MCNotInstalledException();
    }

    /**
     * Sort the reward and start the animation for this crate.
     */
    public void sortRewardAnimation() {
        throw new MCNotInstalledException();
    }

    /**
     * Raffle rewards
     */
    public void sortReward() {
        throw new MCNotInstalledException();
    }

    /**
     * Gives the earned rewards to the player who is in this Crate.
     */
    public void giveReward() {
        throw new MCNotInstalledException();
    }

    /**
     * Check if this Crate has the random locations enabled.
     * @return random locations is enabled?
     */
    public boolean isRandomLocations() {
        throw new MCNotInstalledException();
    }

    /**
     * If the player is null it means that this crate does not belong to any player.
     * This only happens with Crates that are registered globally.
     * @return The player of this crate
     */
    public Player getPlayer() {
        throw new MCNotInstalledException();
    }

    /**
     * Sets a player to this crate.
     * @param player the player
     */
    public void setPlayer(Player player) {
        throw new MCNotInstalledException();
    }

    /**
     * Gets the number of draws that can be made by those who use this Crate.
     * @return The ReRolls
     */
    public int getReRolls() {
        throw new MCNotInstalledException();
    }

    /**
     * Sets the number of draws this Crate will have.
     * @param reRolls the new reRolls
     */
    public void setReRolls(int reRolls) {
        throw new MCNotInstalledException();
    }

    /**
     * If a player is in this crate, you will be able to increase the chances of a draw.
     */
    public void increaseReRolls() {
        throw new MCNotInstalledException();
    }

    /**
     * If a player is in this crate, you will be able to decrease the chances of a draw.
     */
    public void decreaseReRolls() {
        throw new MCNotInstalledException();
    }

    /**
     * Gets the final reward obtained by the player after having drawn the reward list.
     * @return the reward
     */
    public ItemReward getCurrentItemReward() {
        throw new MCNotInstalledException();
    }

    /**
     * Check if this Crate is enabled
     * @return this Crate is enabled?
     */
    public boolean isEnabled() {
        throw new MCNotInstalledException();
    }

    /**
     * This is not to be confused with the ItemReward, this will return the Reward class that handles
     * the settings and configurations of a reward, such as what type of animation it will have, its location,
     * its show time, its sound, push force and much more.
     * @return The reward settings
     */
    public Reward getReward() {
        throw new MCNotInstalledException();
    }

    /**
     * This works with physical crates, if there is a physical crate at that location it will return true.
     * @param location the location
     * @return Is there a physical crate?
     */
    public boolean getCrateLocation(Location location){
        throw new MCNotInstalledException();
    }

    /**
     * Get the item that represents this Crate.
     * @return The item
     */
    public ItemStack getItem() {
        throw new MCNotInstalledException();
    }

    /**
     * Check if this Crate has the Physical option enabled.
     * @return is Physical Crate?
     */
    public boolean isPhysical() {
        throw new MCNotInstalledException();
    }

    /**
     * Previously it was located in com.francobm.magiccrates.api.Reward#getLocation
     * Get the location where the reward will be spawned.
     * @return The location
     */
    public Locations getCurrentLocation() {
        throw new MCNotInstalledException();
    }

    /**
     * Generate a location where the reward will be spawned
     * NOTE: This will only generate new locations if you have more than 1 location set and randomLocations is activated.
     * @return The new location generated or the default location set.
     */
    public Locations generateLocation() {
        throw new MCNotInstalledException();
    }
}
