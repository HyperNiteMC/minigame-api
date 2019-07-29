package com.ericlam.mc.minigames.core.gamestats;

import com.ericlam.mc.minigames.core.function.Castable;

public interface GameStats extends Castable<GameStats> {

    int getPlayed();

    int getKills();

    int getDeaths();

    int getWins();

    double getScores();

    String[] getInfo();

}
