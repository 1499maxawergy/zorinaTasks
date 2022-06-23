package com.company;

public class InitSingleton {
    private static InitSingleton instance;

    public static synchronized InitSingleton getInstance() {
        if (instance == null)
            return new InitSingleton();
        return instance;
    }
}
