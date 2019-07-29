package com.ericlam.mc.minigames.core.manager;

import com.ericlam.mc.minigames.core.character.GamePlayer;
import com.ericlam.mc.minigames.core.game.GameState;
import com.ericlam.mc.minigames.core.game.GameTeam;
import com.ericlam.mc.minigames.core.game.InGameState;

import java.util.List;

public interface GameManager {

    GameState getGameState();

    void endGame(List<GamePlayer> winner, GameTeam winnerTeam, boolean cancel);

    void setState(GameState state);

    InGameState getInGameState();

    String getGamePrefix();
}
