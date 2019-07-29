package com.ericlam.mc.minigames.core.event.player;

import com.ericlam.mc.minigames.core.character.GamePlayer;
import com.ericlam.mc.minigames.core.game.GameState;
import com.ericlam.mc.minigames.core.game.InGameState;

public class GamePlayerQuitEvent extends GamePlayerEvent {

    private GameState gameState;

    public GamePlayerQuitEvent(GamePlayer gamePlayer, InGameState state, GameState gameState) {
        super(gamePlayer, state);
        this.gameState = gameState;
    }


    public GameState getGameState() {
        return gameState;
    }


}
