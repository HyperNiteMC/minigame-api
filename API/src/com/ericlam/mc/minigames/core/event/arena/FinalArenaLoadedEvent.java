package com.ericlam.mc.minigames.core.event.arena;

import com.ericlam.mc.minigames.core.arena.Arena;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;

public final class FinalArenaLoadedEvent extends Event {

    private static final HandlerList handlerList = new HandlerList();

    private final Arena finalArena;

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    public FinalArenaLoadedEvent(@Nonnull Arena finalArena) {
        this.finalArena = finalArena;
    }


    public Arena getFinalArena() {
        return finalArena;
    }

    @Nonnull
    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
