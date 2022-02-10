package com.yuanhui.tutorial.facade;

/**
 * 外观类
 * 用户主要和该类对象交互
 */
public class SmartApplianceFacade {
    // 聚合电灯对象，电视机对象，空调对象
    private final Light light;
    private final TV tv;
    private final AirConditioner airConditioner;

    public SmartApplianceFacade() {
        this.light = new Light();
        this.tv = new TV();
        this.airConditioner = new AirConditioner();
    }

    public void say(String message) {
        if (message.contains("turn on")) {
            on();
        } else if (message.contains("turn off")) {
            off();
        } else {
            System.out.println("don't understand");
        }
    }

    private void on() {
        this.light.on();
        this.tv.on();
        this.airConditioner.on();
    }

    private void off() {
        this.light.off();
        this.tv.off();
        this.airConditioner.off();
    }
}
