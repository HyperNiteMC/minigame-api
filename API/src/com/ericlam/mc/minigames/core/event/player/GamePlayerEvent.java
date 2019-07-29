package com.ericlam.mc.minigames.core.event.player;

import com.ericlam.mc.minigames.core.character.GamePlayer;
import com.ericlam.mc.minigames.core.game.InGameState;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class GamePlayerEvent extends Event {

    private static final HandlerList handlerList = new HandlerList();

    public GamePlayerEvent(GamePlayer gamePlayer, @Nullable InGameState state) {
        this.gamePlayer = gamePlayer;
        this.gameState = state;
    }

    private GamePlayer gamePlayer;

    private InGameState gameState;

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    public GamePlayer getGamePlayer() {
        return gamePlayer;
    }

    @Nullable
    public InGameState getInGameState() {
        return gameState;
    }

    @Nonnull
    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
