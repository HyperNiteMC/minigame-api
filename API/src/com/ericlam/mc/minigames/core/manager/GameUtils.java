package com.ericlam.mc.minigames.core.manager;

import org.bukkit.entity.Player;

public interface GameUtils {

    String getTimeWithUnit(long sec);

    String getTimer(long sec);

    void playSound(Player player, String[] soundString);
}
