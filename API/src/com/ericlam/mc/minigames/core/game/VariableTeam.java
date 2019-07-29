package com.ericlam.mc.minigames.core.game;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.scoreboard.Scoreboard;

public interface VariableTeam extends GameTeam {

    void setTeamName(String teamName);

    void setColor(ChatColor color);

    void setEnabledFriendlyFire(boolean enabled);

    void setScoreboard(Scoreboard scoreboard);

}
