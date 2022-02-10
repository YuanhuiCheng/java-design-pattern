package com.yuanhui.tutorial.singleton;

/**
 * 静态内部类
 */
public class HolderSingleton {
    private HolderSingleton() {

    }

    public static HolderSingleton getInstance() {
        return InnerClass.singleton;
    }

    public static class InnerClass {
        private static final HolderSingleton singleton = new HolderSingleton();
    }
}
