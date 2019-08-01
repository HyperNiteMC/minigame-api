package com.ericlam.mc.minigames.core.game;

import org.bukkit.ChatColor;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class InGameState {

    private final String stateName;
    private final String motd;

    public InGameState(@Nonnull String stateName, @Nullable String motd) {
        this.stateName = stateName;
        this.motd = motd;
    }

    public String getStateName() {
        return stateName;
    }

    @Nullable
    public String getMotd() {
        return motd == null ? null : ChatColor.translateAlternateColorCodes('&', motd);
    }

}
