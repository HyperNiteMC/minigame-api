package com.ericlam.mc.minigames.core.game;

import com.ericlam.mc.minigames.core.function.Castable;
import org.bukkit.ChatColor;
import org.bukkit.scoreboard.Scoreboard;

public interface GameTeam extends Castable<GameTeam> {

    String getTeamName();

    ChatColor getColor();

    boolean isEnabledFriendlyFire();

    Scoreboard getScoreboard();

}
