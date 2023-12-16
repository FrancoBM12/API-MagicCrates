package com.francobm.magiccrates.cache;

import com.francobm.magiccrates.api.Crate;
import com.francobm.magiccrates.cache.editor.EditorSettings;
import com.francobm.magiccrates.utils.MCNotInstalledException;

public class PlayerData {

    /**
     * @return true if you are in a crate transition.
     */
    public boolean isInCrate() {
        throw new MCNotInstalledException();
    }

    /**
     *
     * @return true if the reward within your crate transition has been displayed.
     */
    public boolean isShowReward() {
        throw new MCNotInstalledException();
    }

    /**
     * the boss bars that appear when a reward is displayed
     * @return {@link com.francobm.magiccrates.cache.BossBars}
     */
    public BossBars getBossBars() {
        throw new MCNotInstalledException();
    }

    /**
     * It will delete all the boss bars you currently have active.
     */
    public void removeAllBossBars() {
        throw new MCNotInstalledException();
    }

    /**
     *  To remove a player from the crate transition
     * @param quit - if this parameter is false, it will take it out with transition and opening the reward inventory
     *             otherwise it will take it out without transition and deliver the reward without opening the inventory
     */
    public void exitCrate(boolean quit) {
        throw new MCNotInstalledException();
    }

    /**
     * If you have re-roll opportunities then this will make you do it.
     */
    public void reRollCrate() {
        throw new MCNotInstalledException();
    }

    /**
     * This will cause you to enter into a transition from a crate.
     * @param id of the crate to which it will make you enter
     */
    public void showCrate(String id) {
        throw new MCNotInstalledException();
    }

    /**
     * It will return you to the Crate you are currently in, it may be null.
     * @return {@link com.francobm.magiccrates.api.Crate}
     */
    public Crate getCrate() {
        throw new MCNotInstalledException();
    }

    /**
     * If you are in editor mode then this will make you no longer in editor mode.
     */
    public void disableEditorMode() {
        throw new MCNotInstalledException();
    }

    /**
     * Returns the editor settings you currently have
     * @return {@link com.francobm.magiccrates.cache.editor.EditorSettings}
     */
    public EditorSettings getEditorSettings() {
        throw new MCNotInstalledException();
    }

    /**
     * Determines if your inventory items are locked (i.e. you cannot interact with them). Only true when the player is inside a transition.
     *
     */
    public boolean isLockItems() {
        throw new MCNotInstalledException();
    }
}
