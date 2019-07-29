package com.ericlam.mc.minigames.core.event.player;

import com.ericlam.mc.minigames.core.game.GameState;
import com.ericlam.mc.minigames.core.game.InGameState;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class GamePlayerPreJoinEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList handerlist = new HandlerList();
    private boolean cancelled;
    private GameState state;
    private InGameState inGameState;

    public GamePlayerPreJoinEvent(Player who, GameState state, @Nullable InGameState inGameState) {
        super(who);
        this.cancelled = false;
        this.state = state;
        this.inGameState = inGameState;
    }

    @Nonnull
    @Override
    public HandlerList getHandlers() {
        return handerlist;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }

    public GameState getState() {
        return state;
    }

    @Nullable
    public InGameState getInGameState() {
        return inGameState;
    }
}
