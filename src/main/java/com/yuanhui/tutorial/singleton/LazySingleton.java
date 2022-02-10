package com.yuanhui.tutorial.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * 懒汉式单例
 */
public class LazySingleton {

    private static LazySingleton singleton;

    private static boolean flag = false;

    private LazySingleton() {
        // 不让反射破坏单例模式
        synchronized (LazySingleton.class) {
//            if (singleton != null) {
//                throw new RuntimeException("Don't use reflection to break up singleton");
//            }
            if (!flag) {
                flag = true;
            } else {
                throw new RuntimeException("Don't use reflection to break up singleton");
            }
        }
    }

    /**
     * 双重检测锁模式的懒汉式单例
     * new LazySingleton() 不是原子操作：
     * 1. 分配内存空间
     * 2. 执行构造方法，初始化对象
     * 3. 把对象指向这个空间
     * 指令重排，执行顺序不一定，比如，132
     *
     * @return
     */
    public static LazySingleton getInstance() {
        if (singleton == null) {
            synchronized (LazySingleton.class) {
                if (singleton == null) {
                    singleton = new LazySingleton();
                }
            }
        }
        return singleton;
    }

    // 单线程下没问题，并发环境下出问题
//    public LazySingleton getInstance() {
//        if (singleton == null) {
//            singleton = new LazySingleton();
//        }
//        return singleton;
//    }

    public static void main(String[] args) throws Exception {
        // LazySingleton singleton1 = LazySingleton.getInstance();

        Field flag = LazySingleton.class.getDeclaredField("flag");
        flag.setAccessible(true);

        Constructor<LazySingleton> declaredConstructor = LazySingleton.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true); // ignore private constructor
        LazySingleton singleton2 = declaredConstructor.newInstance();

        flag.set(singleton2, false);
        
        LazySingleton singleton3 = declaredConstructor.newInstance();

        // 反射破坏了单例
        // System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3); // 不去创造对象，再次破坏单例
    }
}
