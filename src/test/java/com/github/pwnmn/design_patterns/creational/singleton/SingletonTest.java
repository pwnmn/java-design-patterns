package com.github.pwnmn.design_patterns.creational.singleton;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonTest {

    @Test
    public void whenCreateSingletonMultipleTimes_thenReturnSameObject() {
        Singleton singleton = Singleton.instance();
        Singleton secondSingleton = Singleton.instance();

        assertEquals(singleton, secondSingleton);
    }
}
