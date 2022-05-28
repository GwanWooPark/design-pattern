package com.study.designpattern.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {
    private Singleton() {}

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
