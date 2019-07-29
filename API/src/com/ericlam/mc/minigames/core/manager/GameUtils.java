package com.ericlam.mc.minigames.core.manager;

import org.bukkit.entity.Player;

public interface GameUtils {

    String getTimeWithUnit(long sec);

    void playSound(Player player, String[] soundString);
}
