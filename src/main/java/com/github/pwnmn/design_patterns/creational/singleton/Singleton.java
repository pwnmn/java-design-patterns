package com.github.pwnmn.design_patterns.creational.singleton;

/**
 * Only one singleton instance will be provided. If this class is loaded by different
 * classloaders, there will be as many instances as classloaders.
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton instance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
