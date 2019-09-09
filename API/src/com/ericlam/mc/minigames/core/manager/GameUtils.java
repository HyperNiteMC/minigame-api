package com.ericlam.mc.minigames.core.manager;

import com.ericlam.mc.minigames.core.character.GamePlayer;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

public interface GameUtils {

    String getTimeWithUnit(long sec);

    String getTimer(long sec);

    void playSound(Player player, String[] soundString);

    <T> void unLagIterate(Collection<T> collection, Consumer<T> task, long period);

    void noLagTeleport(List<GamePlayer> gamePlayers, List<Location> locations, long period);

    void noLagTeleport(List<GamePlayer> gamePlayers, long period, Location... locations);
}
