package com.ericlam.mc.minigames.core.game;

import net.md_5.bungee.api.ChatColor;

public enum GameState {

    VOTING("&a等待中"),

    PRESTART("&b遊戲即將開始"),

    IN_GAME("&b遊戲中"),

    PREEND("&c遊戲邁向完結"),

    ENDED("&c遊戲已完結"),

    STOPPED(null);

    private String motd;

    GameState(final String motd) {
        this.motd = motd;
    }

    public String getMotd() {
        return ChatColor.translateAlternateColorCodes('&', motd);
    }

}
