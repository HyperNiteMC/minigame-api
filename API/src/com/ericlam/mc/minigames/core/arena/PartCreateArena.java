package com.ericlam.mc.minigames.core.arena;

import org.bukkit.util.BlockVector;

public interface PartCreateArena extends CreateArena, PartArena {

    void setTopCorner(BlockVector vector);

    void setBottomCorner(BlockVector vector);

}
