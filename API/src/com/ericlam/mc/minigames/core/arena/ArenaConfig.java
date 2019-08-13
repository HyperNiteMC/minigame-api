package com.ericlam.mc.minigames.core.arena;

import com.google.common.collect.ImmutableMap;
import org.bukkit.Location;
import org.bukkit.World;

import javax.annotation.Nonnull;
import java.io.File;
import java.util.concurrent.CompletableFuture;

public interface ArenaConfig {

    File getArenaFolder();

    int getMaxLoadArena();

    void setExtraWorldSetting(@Nonnull World world);

    ImmutableMap<String, Integer> getAllowWarps();

    Location getLobbyLocation();

    String getFallBackServer();

    String getGamePrefix();

    CompletableFuture<Boolean> setLobbyLocation(final Location location);

}
