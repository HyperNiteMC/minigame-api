package com.ericlam.mc.minigames.core.arena;

import org.bukkit.util.BlockVector;

public interface PartArena extends Arena {

    BlockVector getTopCorner();

    BlockVector getBottomCorner();

}
