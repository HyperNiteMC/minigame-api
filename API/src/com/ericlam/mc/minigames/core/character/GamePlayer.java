package com.ericlam.mc.minigames.core.character;

import com.ericlam.mc.minigames.core.function.Castable;
import org.bukkit.entity.Player;

public interface GamePlayer extends Castable<GamePlayer> {

    Player getPlayer();

    Status getStatus();

    void setStatus(Status status);

    enum Status {
        GAMING, WAITING, SPECTATING;
    }

}
