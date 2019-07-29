package com.ericlam.mc.minigames.core.function;

public interface Castable<E> {
    default <T extends E> T castTo(Class<T> cls) {
        return cls.cast(this);
    }

}
