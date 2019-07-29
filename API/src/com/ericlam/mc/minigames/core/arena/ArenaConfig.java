package com.ericlam.mc.minigames.core.arena;

import com.google.common.collect.ImmutableMap;
import org.bukkit.GameRule;
import org.bukkit.Location;

import java.io.File;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public interface ArenaConfig {

    File getArenaFolder();

    int getMaxLoadArena();

    <T> Map<GameRule<T>, T> getWorldGameRule();

    ImmutableMap<String, Integer> getAllowWarps();

    Location getLobbyLocation();

    String getFallBackServer();

    String getGamePrefix();

    CompletableFuture<Boolean> setLobbyLocation(final Location location);

}
