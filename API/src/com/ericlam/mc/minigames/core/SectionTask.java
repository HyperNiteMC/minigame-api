package com.ericlam.mc.minigames.core;

import com.ericlam.mc.minigames.core.manager.PlayerManager;

public interface SectionTask {

    void initTimer(PlayerManager playerManager);

    void onCancel();

    void onFinish();

    void run(long remain);

    long getTotalTime();

    boolean shouldCancel();

    boolean isRunning();

    void setRunning(boolean running);
}
