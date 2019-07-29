package com.ericlam.mc.minigames.core.manager;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;

import java.util.List;
import java.util.Random;

public interface FireWorkManager {

    FireworkMeta getFirework(Firework firework);

    FireworkMeta getQuickFirework(Firework firework);

    Color getRandomColor(Random random);

    void spawnFireWork(Player player);

    void spawnFireWork(List<Location> locations);

}
