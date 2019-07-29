package com.ericlam.mc.minigames.core.event.player;

import com.ericlam.mc.minigames.core.arena.Arena;
import com.ericlam.mc.minigames.core.character.GamePlayer;
import org.bukkit.event.Cancellable;

import javax.annotation.Nonnull;

public final class GamePlayerVoteEvent extends GamePlayerEvent implements Cancellable {

    private Arena voted;
    private boolean cancel;

    public GamePlayerVoteEvent(@Nonnull Arena voted, GamePlayer gamePlayer) {
        super(gamePlayer, null);
        this.voted = voted;
        this.cancel = false;
    }

    public Arena getVoted() {
        return voted;
    }


    public void setVoted(Arena voted) {
        this.voted = voted;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancel = b;
    }
}
