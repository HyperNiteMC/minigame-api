package com.ericlam.mc.minigames.core.factory;

import com.ericlam.mc.minigames.core.factory.compass.CompassFactory;
import com.ericlam.mc.minigames.core.factory.scoreboard.ScoreboardFactory;

public interface GameFactory {

    ScoreboardFactory getScoreboardFactory();

    CompassFactory getCompassFactory();

}
