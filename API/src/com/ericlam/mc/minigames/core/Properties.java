package com.ericlam.mc.minigames.core;

import com.ericlam.mc.minigames.core.factory.GameFactory;
import com.hypernite.mc.hnmc.core.managers.YamlManager;

public interface Properties {

    YamlManager getMinigameConfig();

    GameFactory getGameFactory();

}
