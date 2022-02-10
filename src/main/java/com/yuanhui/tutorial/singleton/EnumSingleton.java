package com.yuanhui.tutorial.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * enum（枚举）本身也是一个class
 */
public enum EnumSingleton {
    SINGLETON;

    public EnumSingleton getInstance() {
        return SINGLETON;
    }
}

class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        EnumSingleton singleton1 = EnumSingleton.SINGLETON;
        EnumSingleton singleton2 = EnumSingleton.SINGLETON;

        System.out.println(singleton1);
        System.out.println(singleton2);

        // 反射不能破坏枚举
        // NoSuchMethodException
        // Constructor<EnumSingleton> declaredConstructor = EnumSingleton.class.getDeclaredConstructor(null);
        Constructor<EnumSingleton> declaredConstructor =
                EnumSingleton.class.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        EnumSingleton singleton3 = declaredConstructor.newInstance();
        System.out.println(singleton3);
    }
}
