package com.ericlam.mc.minigames.core.event.player;

import com.ericlam.mc.minigames.core.character.GamePlayer;
import com.ericlam.mc.minigames.core.game.InGameState;

import javax.annotation.Nullable;

public class GamePlayerDeathEvent extends GamePlayerEvent {

    private final GamePlayer killer;
    private final DeathCause deathCause;
    private final String action;

    public GamePlayerDeathEvent(@Nullable GamePlayer killer, GamePlayer gamePlayer, DeathCause deathCause, InGameState state, String action) {
        super(gamePlayer, state);
        this.killer = killer;
        this.deathCause = deathCause;
        this.action = action;
    }

    @Nullable
    public GamePlayer getKiller() {
        return killer;
    }

    public DeathCause getDeathCause() {
        return deathCause;
    }


    public String getAction() {
        return action;
    }

    public enum DeathCause {

        CRACKSHOT,

        BUKKIT_DAMAGE,

        BUKKIT_KILL,

        BUKKIT_DEATH,

        CUSTOM;

        private String value;

        public static DeathCause ofCustom(String value) {
            CUSTOM.setValue(value);
            return CUSTOM;
        }

        public String getValue() {
            return this == CUSTOM ? value : this.toString().toLowerCase();
        }

        private void setValue(String value) {
            this.value = value;
        }
    }
}
