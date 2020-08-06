package com.baddragon.Multiton;

import java.util.concurrent.ConcurrentHashMap;

public class Multiton {

    public static class Singleton {
        protected Singleton() {
        }
    }

    //ConcurrentHashMap is thread-safe and does not lock on .get()
    static ConcurrentHashMap<Integer, Singleton> instances;

    static {
        instances = new ConcurrentHashMap<>(3);

        for (int i = 0; i < instances.size(); ++i)
            instances.put(i, new Singleton());
    }

    public static Singleton getInstance(int id) {
        if (id < 0 || id > instances.size()) {
            return null;
        }

        return instances.get(id);
    }

}
