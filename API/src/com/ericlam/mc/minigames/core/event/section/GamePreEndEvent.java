package com.ericlam.mc.minigames.core.event.section;

import com.ericlam.mc.minigames.core.character.GamePlayer;
import com.ericlam.mc.minigames.core.game.GameState;
import com.ericlam.mc.minigames.core.game.GameTeam;
import com.ericlam.mc.minigames.core.game.InGameState;
import com.ericlam.mc.minigames.core.manager.PlayerManager;
import com.google.common.collect.ImmutableList;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class GamePreEndEvent extends GameSectionEvent {

    private final ImmutableList<GamePlayer> winners;

    private final GameTeam winnerTeam;

    public GamePreEndEvent(@Nonnull PlayerManager playerManager, ImmutableList<GamePlayer> winners, @Nullable GameTeam winnerTeam, @Nullable InGameState inGameState, GameState gameState) {
        super(playerManager, inGameState, gameState);
        this.winners = winners;
        this.winnerTeam = winnerTeam;
    }

    public ImmutableList<GamePlayer> getWinners() {
        return winners;
    }

    @Nullable
    public GameTeam getWinnerTeam() {
        return winnerTeam;
    }
}
