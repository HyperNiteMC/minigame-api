package com.ericlam.mc.minigames.core.arena;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;

public interface ArenaMechanic {

    CreateArena loadCreateArena(FileConfiguration yml, Arena info);

    CreateArena createArena(@Nonnull final String name, @Nonnull final Player player);

    void saveExtraArenaSetting(FileConfiguration preSaveYml, Arena arena);

}
