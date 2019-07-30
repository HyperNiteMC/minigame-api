package com.ericlam.mc.minigames.core.event.player;

import com.ericlam.mc.minigames.core.character.GamePlayer;
import com.ericlam.mc.minigames.core.game.InGameState;
import com.ericlam.mc.minigames.core.main.MinigamesCore;
import org.bukkit.entity.Entity;

import javax.annotation.Nullable;

public final class CrackShotDeathEvent extends GamePlayerDeathEvent {

    private String weaponTitle;
    private Entity bullet;

    public CrackShotDeathEvent(@Nullable GamePlayer killer, GamePlayer gamePlayer, InGameState state, String weaponTitle, Entity bullet) {
        super(killer, gamePlayer, DeathCause.CRACKSHOT, state, MinigamesCore.getProperties().getMinigameConfig().getPureMessage("death-msg.action.".concat(bullet == null ? "normal" : "gun")));
        this.weaponTitle = weaponTitle;
        this.bullet = bullet;
    }


    public String getWeaponTitle() {
        return weaponTitle;
    }

    public Entity getBullet() {
        return bullet;
    }
}
