package com.yuanhui.tutorial.proxy.dynamic.jdk;

/**
 * 目标类（原对象）
 */
public class Customer implements OrderInterface {
    @Override
    public String order(String foodName) {
        return "Already ordered " + foodName;
    }

    @Override
    public void test() {

    }

    @Override
    public void test2() {

    }
}
