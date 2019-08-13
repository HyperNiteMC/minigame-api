package com.ericlam.mc.minigames.core.event.player;

import com.ericlam.mc.minigames.core.character.GamePlayer;
import com.ericlam.mc.minigames.core.game.InGameState;
import com.ericlam.mc.minigames.core.main.MinigamesCore;
import org.bukkit.entity.Entity;

import javax.annotation.Nullable;
import java.util.Set;

public final class CrackShotDeathEvent extends GamePlayerDeathEvent {

    private String weaponTitle;
    private Entity bullet;
    private Set<DamageType> types;

    public CrackShotDeathEvent(@Nullable GamePlayer killer, GamePlayer gamePlayer, InGameState state, String weaponTitle, Entity bullet, Set<DamageType> types) {
        super(killer, gamePlayer, DeathCause.CRACKSHOT, state, MinigamesCore.getProperties().getMinigameConfig().getPureMessage("death-msg.action.".concat(bullet == null ? "normal" : "gun")));
        this.weaponTitle = weaponTitle;
        this.bullet = bullet;
        this.types = types;
    }

    public Set<DamageType> getDamageTypes() {
        return types;
    }

    public enum DamageType {
        BACKSTAB,
        CRITICAL,
        HEADSHOT
    }

    public String getWeaponTitle() {
        return weaponTitle;
    }

    public Entity getBullet() {
        return bullet;
    }
}
