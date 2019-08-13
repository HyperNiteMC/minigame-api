package com.ericlam.mc.minigames.core.manager;

import com.ericlam.mc.minigames.core.character.GamePlayer;
import com.ericlam.mc.minigames.core.exception.gamestats.PlayerNotExistException;
import com.ericlam.mc.minigames.core.gamestats.GameStatsEditor;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.concurrent.CompletableFuture;

public interface GameStatsManager {

    String[] getStatsInfo(GamePlayer player) throws PlayerNotExistException;

    String[] getStatsInfo(Player player) throws PlayerNotExistException;

    void addKills(GamePlayer player, int kills);

    void minusKills(GamePlayer player, int kills);

    void addDeaths(GamePlayer player, int deaths);

    void minusDeaths(GamePlayer player, int deaths);

    void addWins(GamePlayer player, int wins);

    void minusWins(GamePlayer player, int wins);

    void addPlayed(GamePlayer player, int played);

    void minusPlayed(GamePlayer player, int played);

    GameStatsEditor getGameStats(GamePlayer player) throws PlayerNotExistException;

    CompletableFuture<Boolean> loadGameStats(GamePlayer player);

    CompletableFuture<Void> saveAll();

    CompletableFuture<Void> savePlayer(OfflinePlayer player) throws PlayerNotExistException;

}
