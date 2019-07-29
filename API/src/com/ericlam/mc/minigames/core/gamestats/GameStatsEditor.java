package com.ericlam.mc.minigames.core.gamestats;

public interface GameStatsEditor extends GameStats {

    void setKills(int kills);

    void setDeaths(int deaths);

    void setPlayed(int played);

    void setWins(int wins);

}
