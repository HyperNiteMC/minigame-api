package com.ericlam.mc.minigames.core.manager;

import com.ericlam.mc.minigames.core.arena.Arena;
import com.ericlam.mc.minigames.core.exception.arena.ArenaNotLoadedException;
import com.ericlam.mc.minigames.core.exception.arena.FinalArenaAlreadyExistException;

import java.util.List;

public interface ArenaManager {

    Arena getFinalArena();

    List<Arena> getLoadedArenas() throws ArenaNotLoadedException, FinalArenaAlreadyExistException;
}
