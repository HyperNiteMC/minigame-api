package com.ericlam.mc.minigames.core.main;

import com.ericlam.mc.minigames.core.MinigamesAPI;
import com.ericlam.mc.minigames.core.Properties;
import com.ericlam.mc.minigames.core.factory.GameFactory;
import com.ericlam.mc.minigames.core.manager.*;
import com.ericlam.mc.minigames.core.registable.Compulsory;
import com.ericlam.mc.minigames.core.registable.Registration;
import com.ericlam.mc.minigames.core.registable.Voluntary;
import com.hypernite.mc.hnmc.core.managers.YamlManager;

import java.util.Optional;

public final class MinigamesCore implements MinigamesAPI, Registration, Properties {

    public static MinigamesAPI getApi() {
        throw new RuntimeException();
    }

    public static Optional<MinigamesAPI> getApiSafe() {
        throw new RuntimeException();
    }

    public static Registration getRegistration() {
        throw new RuntimeException();
    }

    public static Properties getProperties() {
        throw new RuntimeException();
    }

    @Override
    public YamlManager getMinigameConfig() {
        return null;
    }

    @Override
    public GameFactory getGameFactory() {
        return null;
    }

    @Override
    public FireWorkManager getFireWorkManager() {
        return null;
    }

    @Override
    public ArenaManager getArenaManager() {
        return null;
    }

    @Override
    public LobbyManager getLobbyManager() {
        return null;
    }

    @Override
    public ScheduleManager getScheduleManager() {
        return null;
    }

    @Override
    public GameItemManager getGameItemManager() {
        return null;
    }

    @Override
    public ArenaCreateManager getArenaCreateManager() {
        return null;
    }

    @Override
    public GameStatsManager getGameStatsManager() {
        return null;
    }

    @Override
    public PlayerManager getPlayerManager() {
        return null;
    }

    @Override
    public GameManager getGameManager() {
        return null;
    }

    @Override
    public GameUtils getGameUtils() {
        return null;
    }

    @Override
    public Compulsory getCompulsory() {
        return null;
    }

    @Override
    public Voluntary getVoluntary() {
        return null;
    }
}
