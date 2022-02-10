package com.yuanhui.tutorial.singleton;

/**
 * 饿汉式单例
 * 浪费内存
 */
public class HungrySingleton {

    private final static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return singleton;
    }
}
