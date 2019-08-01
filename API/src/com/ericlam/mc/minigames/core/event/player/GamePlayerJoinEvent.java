package com.ericlam.mc.minigames.core.event.player;

import com.ericlam.mc.minigames.core.character.GamePlayer;
import com.ericlam.mc.minigames.core.game.GameState;
import com.ericlam.mc.minigames.core.game.InGameState;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class GamePlayerJoinEvent extends GamePlayerEvent {

    private GameState gameState;

    public GamePlayerJoinEvent(GamePlayer gamePlayer, @Nullable InGameState state, @Nonnull GameState gameState) {
        super(gamePlayer, state);
        this.gameState = gameState;
    }

    public GameState getGameState() {
        return gameState;
    }
}
