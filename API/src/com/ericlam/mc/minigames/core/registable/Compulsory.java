package com.ericlam.mc.minigames.core.registable;

import com.ericlam.mc.minigames.core.SectionTask;
import com.ericlam.mc.minigames.core.arena.ArenaConfig;
import com.ericlam.mc.minigames.core.arena.ArenaMechanic;
import com.ericlam.mc.minigames.core.character.GamePlayerHandler;
import com.ericlam.mc.minigames.core.gamestats.GameStatsHandler;
import com.hypernite.mc.hnmc.core.builders.InventoryBuilder;
import com.hypernite.mc.hnmc.core.misc.commands.DefaultCommand;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;

public interface Compulsory {

    void registerLobbyTask(SectionTask task);

    void registerEndTask(SectionTask task);

    void registerArenaCommand(DefaultCommand defaultCommand, final JavaPlugin plugin);

    void registerArenaConfig(@Nonnull ArenaConfig arenaConfig);

    void registerArenaMechanic(@Nonnull ArenaMechanic arenaMechanic);

    void registerGamePlayerHandler(@Nonnull GamePlayerHandler gamePlayerHandler);

    void registerGameStatsHandler(@Nonnull GameStatsHandler gameStatsHandler);

    void registerVoteGUI(InventoryBuilder inventoryBuilder, Integer... allowSlot);
}
