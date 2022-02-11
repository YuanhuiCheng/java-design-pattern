package com.yuanhui.tutorial.observer;

/**
 * 具体观察者角色类
 */
public class WechatUser implements Observer {
    private final String name;

    public WechatUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " receives: " + message);
    }
}
