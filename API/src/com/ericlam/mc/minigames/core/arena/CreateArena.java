package com.ericlam.mc.minigames.core.arena;

import com.ericlam.mc.minigames.core.exception.NoMoreElementException;
import com.ericlam.mc.minigames.core.exception.arena.create.LocationMaxReachedException;
import com.ericlam.mc.minigames.core.exception.arena.create.NoMoreLocationException;
import com.ericlam.mc.minigames.core.exception.arena.create.WarpExistException;
import com.ericlam.mc.minigames.core.exception.arena.create.WarpNotExistException;
import org.bukkit.Location;
import org.bukkit.World;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface CreateArena extends Arena {

    void setAuthor(String author);

    void setWorld(World world);

    void setArenaName(String arenaName);

    void setDisplayName(String displayName);

    default void addLocation(String warp, Location location, final int max) throws WarpNotExistException, LocationMaxReachedException {
        List<Location> locs = Optional.ofNullable(getWarp(warp)).orElseThrow(() -> new WarpNotExistException(warp));
        if (locs.size() >= max) throw new LocationMaxReachedException(warp);
        locs.add(location);
    }

    default void removeLastLocation(String warp) throws WarpNotExistException, NoMoreLocationException {
        List<Location> locs = Optional.ofNullable(getWarp(warp)).orElseThrow(() -> new WarpNotExistException(warp));
        if (locs.size() == 0) throw new NoMoreLocationException(warp);
        locs.remove(locs.size() - 1);
    }

    default void addWarp(String warp) throws WarpExistException {
        if (getLocationsMap().putIfAbsent(warp, new LinkedList<>()) != null) throw new WarpExistException(warp);
    }

    default void removeWarp(String warp) throws WarpNotExistException {
        if (getLocationsMap().remove(warp) == null) throw new WarpNotExistException(warp);
    }

    default void addDescriptionLine(String text) {
        getDescription().add(text);
    }

    default void removeDescriptionLine() throws NoMoreElementException {
        if (getDescription().size() == 0) throw new NoMoreElementException(this.getArenaName());
        getDescription().remove(getDescription().size() - 1);
    }

    void setLocationMap(Map<String, List<Location>> locationMap);

    boolean isChanged();

    void setChanged(Boolean changed);

    boolean isSetupCompleted();
}
