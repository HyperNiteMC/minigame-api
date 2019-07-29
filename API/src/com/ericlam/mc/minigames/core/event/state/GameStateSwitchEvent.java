package com.ericlam.mc.minigames.core.event.state;

import com.ericlam.mc.minigames.core.event.GameEvent;
import com.ericlam.mc.minigames.core.game.GameState;
import com.ericlam.mc.minigames.core.game.InGameState;
import com.ericlam.mc.minigames.core.manager.PlayerManager;

public final class GameStateSwitchEvent extends GameEvent {

    public GameStateSwitchEvent(InGameState inGameState, GameState gameState, PlayerManager playerManager) {
        super(inGameState, gameState, playerManager);
    }


}
