package com.ericlam.mc.minigames.core.arena;

import com.ericlam.mc.minigames.core.function.Castable;
import org.bukkit.Location;
import org.bukkit.World;

import java.util.List;
import java.util.Map;

public interface Arena extends Castable<Arena> {

    String getAuthor();

    World getWorld();

    String getArenaName();

    String getDisplayName();

    Map<String, List<Location>> getLocationsMap();

    default List<Location> getWarp(String warp) {
        return getLocationsMap().get(warp);
    }

    List<String> getDescription();

    String[] getInfo();

}
