package com.ericlam.mc.minigames.core.event;

import com.ericlam.mc.minigames.core.character.GamePlayer;
import com.ericlam.mc.minigames.core.game.GameState;
import com.ericlam.mc.minigames.core.game.InGameState;
import com.ericlam.mc.minigames.core.manager.PlayerManager;
import com.google.common.collect.ImmutableList;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class GameEvent extends Event {


    private InGameState inGameState;

    private GameState gameState;

    private static final HandlerList handlerList = new HandlerList();
    private PlayerManager playerManager;

    public GameEvent(@Nullable InGameState inGameState, @Nonnull GameState gameState, @Nonnull PlayerManager playerManager) {
        this.inGameState = inGameState;
        this.gameState = gameState;
        this.playerManager = playerManager;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    public InGameState getInGameState() {
        return inGameState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public ImmutableList<GamePlayer> getTotalPlayers() {
        return playerManager.getTotalPlayers();
    }

    public ImmutableList<GamePlayer> getGamingPlayer() {
        return playerManager.getGamePlayer();
    }

    public ImmutableList<GamePlayer> getWaitingPlayer() {
        return playerManager.getWaitingPlayer();
    }

    public ImmutableList<GamePlayer> getSpectators() {
        return playerManager.getSpectators();
    }


    @Nonnull
    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
