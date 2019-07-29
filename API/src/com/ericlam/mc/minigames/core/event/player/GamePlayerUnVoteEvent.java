package com.ericlam.mc.minigames.core.event.player;

import com.ericlam.mc.minigames.core.arena.Arena;
import com.ericlam.mc.minigames.core.character.GamePlayer;

import javax.annotation.Nullable;

public final class GamePlayerUnVoteEvent extends GamePlayerEvent {

    private final Arena previousVoted;

    public GamePlayerUnVoteEvent(@Nullable Arena previousVoted, GamePlayer gamePlayer) {
        super(gamePlayer, null);
        this.previousVoted = previousVoted;
    }


    @Nullable
    public Arena getPreviousVoted() {
        return previousVoted;
    }
}
