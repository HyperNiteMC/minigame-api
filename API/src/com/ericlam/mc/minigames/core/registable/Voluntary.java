package com.ericlam.mc.minigames.core.registable;

import com.ericlam.mc.minigames.core.SectionTask;
import com.ericlam.mc.minigames.core.game.GameTeam;
import com.ericlam.mc.minigames.core.game.InGameState;
import org.bukkit.inventory.ItemStack;

public interface Voluntary {

    void registerGameTask(InGameState state, SectionTask task);

    void addJoinItem(int slot, ItemStack item);

    void addGameItem(GameTeam team, int slot, ItemStack item);

    void addGameItem(int slot, ItemStack item);

    void addSpectatorItem(GameTeam team, int slot, ItemStack item);

    void addSpectatorITem(int slot, ItemStack item);

}
