package com.ericlam.mc.minigames.core.factory.compass;

import com.ericlam.mc.minigames.core.character.GamePlayer;
import com.ericlam.mc.minigames.core.game.GameTeam;

public interface CompassTracker {

    void setIndividualTarget(GamePlayer player, GameTeam team);

    void launch();

    void destroy();

}
