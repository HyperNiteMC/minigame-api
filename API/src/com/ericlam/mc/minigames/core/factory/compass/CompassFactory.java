package com.ericlam.mc.minigames.core.factory.compass;

import com.ericlam.mc.minigames.core.factory.Factory;
import com.ericlam.mc.minigames.core.game.GameTeam;

public interface CompassFactory extends Factory<CompassTracker> {

    CompassFactory setTeamTarget(GameTeam team, GameTeam target);

    CompassFactory setTrackerRange(int range);

    CompassFactory setSearchingText(String... text);

    /**
     * Placeholders:
     *
     * <target> - targetName
     * <distance> - distance between target
     * <team> - teamName
     *
     * @param caughtText 捕獲到目標時的指南針標題
     */
    CompassFactory setCaughtText(String caughtText);

}
