package com.ericlam.mc.minigames.core.manager;

import com.ericlam.mc.minigames.core.arena.Arena;
import com.ericlam.mc.minigames.core.character.GamePlayer;
import com.ericlam.mc.minigames.core.exception.AlreadyVotedException;
import com.ericlam.mc.minigames.core.exception.arena.NoFinalArenaException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import org.bukkit.entity.Player;

import java.util.Optional;

public interface LobbyManager {

    void tpLobbySpawn(Player player);

    ImmutableList<Arena> getCandidate();

    Optional<Arena> getVoted(GamePlayer player);

    void vote(GamePlayer player, Arena arena) throws AlreadyVotedException;

    void unVote(GamePlayer player);

    ImmutableMap<Arena, ImmutableList<GamePlayer>> getResult();

    void runFinalResult() throws NoFinalArenaException;

}
