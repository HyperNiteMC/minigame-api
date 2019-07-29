package com.ericlam.mc.minigames.core.factory.scoreboard;

import com.ericlam.mc.minigames.core.factory.Factory;
import com.ericlam.mc.minigames.core.game.GameTeam;
import org.bukkit.scoreboard.Team;

public interface ScoreboardFactory extends Factory<GameBoard> {

    ScoreboardFactory addTeam(GameTeam team);

    ScoreboardFactory addTeamSetting(GameTeam gameTeam, Team.Option option, Team.OptionStatus status);

    ScoreboardFactory setTitle(String title);

    ScoreboardFactory setLine(String key, String text, int score);

    ScoreboardFactory addLine(String text, int score);


}
