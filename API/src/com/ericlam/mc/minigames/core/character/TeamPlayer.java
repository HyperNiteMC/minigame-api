package com.ericlam.mc.minigames.core.character;

import com.ericlam.mc.minigames.core.game.GameTeam;

public interface TeamPlayer extends GamePlayer {

    GameTeam getTeam();

    void setTeam(GameTeam team);

}
