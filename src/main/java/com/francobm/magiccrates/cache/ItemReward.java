package com.francobm.magiccrates.cache;

import com.francobm.magiccrates.utils.MCNotInstalledException;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class ItemReward {

    /**
     * Get the id of this ItemReward
     * @return The id
     */
    public String getId() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the preview item of this ItemReward
     * @return The preview item
     */
    public ItemStack getPreview() {
        throw new MCNotInstalledException();
    }

    /**
     * Get all items of this ItemReward
     * @return The items
     */
    public List<ItemStack> getItems() {
        throw new MCNotInstalledException();
    }

    /**
     * Adds an item to the list of reward items.
     * @param item item that had been added.
     */
    public void addItem(ItemStack item) {
        throw new MCNotInstalledException();
    }

    /**
     * Set a chance
     * @param chance the new chance of this reward
     */
    public void setChance(double chance){
        throw new MCNotInstalledException();
    }

    /**
     * Get the chance of this ItemReward
     * @return The chance
     */
    public double getChance() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the broadcast messages.
     * @return The messages
     */
    public List<String> getBroadcast(){
        throw new MCNotInstalledException();
    }

    /**
     * Get the commands of this ItemReward
     * @return The commands
     */
    public List<String> getCommands() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the messages of this ItemReward
     * @return The messages
     */
    public List<String> getMessages() {
        throw new MCNotInstalledException();
    }

    /**
     * Get the name of this ItemReward
     * @return The name
     */
    public String getName(){
        throw new MCNotInstalledException();
    }

    /**
     * Get the Preview Name of this ItemReward
     * @return The Preview Name
     */
    public String getPreviewName() {
        throw new MCNotInstalledException();
    }
}
