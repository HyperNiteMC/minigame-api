package com.ericlam.mc.minigames.core;

import com.ericlam.mc.minigames.core.factory.GameFactory;
import com.hypernite.mc.hnmc.core.managers.YamlManager;

/**
 * 獲取其他設定
 */
public interface Properties {

    /**
     * 獲取 Config 管理器
     *
     * @return 獲取 Config 管理器
     */
    YamlManager getMinigameConfig();

    /**
     * 獲取遊戲工廠
     * @return 遊戲工廠
     */
    GameFactory getGameFactory();

}
