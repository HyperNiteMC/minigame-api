package com.ericlam.mc.minigames.core;

import com.ericlam.mc.minigames.core.factory.GameFactory;
import com.hypernite.mc.hnmc.core.managers.ConfigManager;

public interface Properties {

    ConfigManager getMinigameConfig();

    GameFactory getGameFactory();

}
