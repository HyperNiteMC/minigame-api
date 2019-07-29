package com.ericlam.mc.minigames.core.event.arena;

import com.ericlam.mc.minigames.core.arena.Arena;
import com.google.common.collect.ImmutableList;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;

public final class AsyncArenaLoadedEvent extends Event {

    private final HandlerList handlerList = new HandlerList();

    private final ImmutableList<Arena> loadedArenas;

    public AsyncArenaLoadedEvent(ImmutableList<Arena> loadedArenas) {
        super(true);
        this.loadedArenas = loadedArenas;
    }


    public ImmutableList<Arena> getLoadedArenas() {
        return loadedArenas;
    }

    @Nonnull
    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
