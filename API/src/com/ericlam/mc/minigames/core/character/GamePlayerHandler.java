package com.ericlam.mc.minigames.core.character;

import org.bukkit.entity.Player;

public interface GamePlayerHandler {

    void onPlayerStatusChange(GamePlayer player, GamePlayer.Status status);

    void onPlayerRemove(GamePlayer player);

    GamePlayer createGamePlayer(Player player);

    int requireStart();

}
