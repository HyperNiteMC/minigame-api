package com.ericlam.mc.minigames.core;

import com.ericlam.mc.minigames.core.manager.*;

public interface MinigamesAPI {

    FireWorkManager getFireWorkManager();

    ArenaManager getArenaManager();

    LobbyManager getLobbyManager();

    ScheduleManager getScheduleManager();

    GameItemManager getGameItemManager();

    ArenaCreateManager getArenaCreateManager();

    GameStatsManager getGameStatsManager();

    PlayerManager getPlayerManager();

    GameManager getGameManager();

    GameUtils getGameUtils();

}
