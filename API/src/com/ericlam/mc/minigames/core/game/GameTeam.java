package com.ericlam.mc.minigames.core.game;

import com.ericlam.mc.minigames.core.function.Castable;
import org.bukkit.ChatColor;

public interface GameTeam extends Castable<GameTeam> {

    String getTeamName();

    ChatColor getColor();

    boolean isEnabledFriendlyFire();

}
