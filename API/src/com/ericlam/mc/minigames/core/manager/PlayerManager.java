package com.ericlam.mc.minigames.core.manager;

import com.ericlam.mc.minigames.core.character.GamePlayer;
import com.ericlam.mc.minigames.core.character.GamePlayerHandler;
import com.google.common.collect.ImmutableList;
import org.bukkit.entity.Player;

import java.util.Optional;

public interface PlayerManager {

    ImmutableList<GamePlayer> getTotalPlayers();

    ImmutableList<GamePlayer> getSpectators();

    GamePlayerHandler getGamePlayerHandler();

    ImmutableList<GamePlayer> getGamePlayer();

    ImmutableList<GamePlayer> getWaitingPlayer();

    Optional<GamePlayer> findPlayer(Player player);

    GamePlayer buildGamePlayer(Player player);

    void setGamePlayer(GamePlayer player);

    void setWaitingPlayer(GamePlayer player);

    void setSpectator(GamePlayer player);

    boolean shouldStart();

    void removePlayer(GamePlayer player);

}
