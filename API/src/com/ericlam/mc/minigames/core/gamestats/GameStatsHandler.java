package com.ericlam.mc.minigames.core.gamestats;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public interface GameStatsHandler {

    @Nonnull
    GameStatsEditor loadGameStatsData(@Nonnull Player player);

    CompletableFuture<Void> saveGameStatsData(OfflinePlayer player, GameStats gameStats);

    CompletableFuture<Void> saveGameStatsData(Map<OfflinePlayer, GameStats> gameStatsMap);

}
