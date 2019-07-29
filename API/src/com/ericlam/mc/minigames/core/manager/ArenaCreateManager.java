package com.ericlam.mc.minigames.core.manager;

import com.ericlam.mc.minigames.core.arena.Arena;
import com.ericlam.mc.minigames.core.arena.CreateArena;
import com.ericlam.mc.minigames.core.exception.NoMoreElementException;
import com.ericlam.mc.minigames.core.exception.arena.create.*;
import com.google.common.collect.ImmutableList;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ArenaCreateManager {

    void setAuthor(String arena, String author) throws ArenaNotExistException;

    void setDisplayName(String arena, String displayName) throws ArenaNotExistException;

    void setName(String arena, String newName) throws ArenaNotExistException, ArenaNameExistException;

    void addSpawn(String arena, String warp, Location location) throws ArenaNotExistException, WarpNotExistException, LocationMaxReachedException;

    void removeSpawn(String arena, String warp) throws ArenaNotExistException, WarpNotExistException, NoMoreLocationException;

    void createWarp(String arena, String warp) throws ArenaNotExistException, WarpExistException, IllegalWarpException;

    void removeWarp(String arena, String warp) throws ArenaNotExistException, WarpNotExistException;

    CompletableFuture<Boolean> saveArena(String arena) throws SetUpNotFinishException, ArenaNotExistException, ArenaUnchangedExcpetion;

    String[] getArenaInfo(String arena) throws ArenaNotExistException;

    CompletableFuture<Boolean> deleteArena(String arena) throws ArenaNotExistException;

    void createArena(String name, Player player) throws ArenaExistException;

    Arena[] getArenasFromWorld(World world);

    ImmutableList<Arena> getArenaList();

    List<String> getWarpList(String arena) throws ArenaNotExistException;

    CreateArena getCreateArena(String arena) throws ArenaNotExistException;

    void addDescriptionLine(String arena, String text) throws ArenaNotExistException;

    void removeDescriptionLine(String arena) throws NoMoreElementException, ArenaNotExistException;
}
