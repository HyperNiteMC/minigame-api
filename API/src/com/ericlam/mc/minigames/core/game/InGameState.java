package com.ericlam.mc.minigames.core.game;

import com.ericlam.mc.minigames.core.function.Castable;

public interface InGameState extends Castable<InGameState> {

    String getStateName();

    String getMotd();

}
