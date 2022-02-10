package com.yuanhui.tutorial.proxy.staticdemo;

/**
 * 目标类（原对象）
 */
public class Customer implements OrderInterface {
    @Override
    public String order(String foodName) {
        return "Already ordered " + foodName;
    }
}
