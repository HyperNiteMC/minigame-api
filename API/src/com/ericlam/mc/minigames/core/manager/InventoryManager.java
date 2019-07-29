package com.ericlam.mc.minigames.core.manager;

import com.ericlam.mc.minigames.core.character.GamePlayer;
import com.ericlam.mc.minigames.core.exception.arena.ArenaNotLoadedException;
import com.ericlam.mc.minigames.core.exception.arena.FinalArenaAlreadyExistException;
import org.bukkit.inventory.Inventory;

public interface InventoryManager {

    Inventory getVoteInventory() throws ArenaNotLoadedException, FinalArenaAlreadyExistException;

    Inventory getSpectatorTpInventory();

    void removeGamingPlayer(GamePlayer player);

}
