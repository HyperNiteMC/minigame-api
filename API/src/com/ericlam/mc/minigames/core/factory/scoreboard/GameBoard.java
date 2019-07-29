package com.ericlam.mc.minigames.core.factory.scoreboard;

import com.ericlam.mc.minigames.core.character.GamePlayer;
import com.google.common.collect.ImmutableMap;

public interface GameBoard {

    void setTitle(String title);

    void addPlayer(GamePlayer player);

    void removePlayer(GamePlayer player);

    ImmutableMap<String, Integer> getSidebarLine();

    void setScore(String key, int score);

    void setLine(String key, String line);

    void setLine(String key, String line, int score);

    void destroy();
}
