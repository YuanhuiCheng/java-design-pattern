package com.yuanhui.tutorial.adapter;

/**
 * 真正的适配器
 * 需要连接usb，连接网线
 * <p>
 * 继承 （类适配器，单继承）
 * 组合 （对象适配器，常用）
 */
public class Adapter2 implements NetToUsb {
    private final Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
