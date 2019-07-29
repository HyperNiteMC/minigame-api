package com.ericlam.mc.minigames.core.manager;

import com.ericlam.mc.minigames.core.exception.task.TaskAlreadyRunningException;
import com.ericlam.mc.minigames.core.game.InGameState;

import javax.annotation.Nullable;

public interface ScheduleManager {

    void startFirst();

    void start(InGameState state) throws TaskAlreadyRunningException;

    boolean isRunning(InGameState state);

    void cancelCurrent();

    void finishCurrent();

    void jumpInto(InGameState state, boolean cancel);

    @Nullable
    InGameState getCurrentGameState();

}
