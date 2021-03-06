package com.yuanhui.tutorial.adapter;

/**
 * 真正的适配器
 * 需要连接usb，连接网线
 *
 * 继承 （类适配器，单继承）
 * 组合 （对象适配器，常用）
 */
public class Adapter extends Adaptee implements NetToUsb {
    @Override
    public void handleRequest() {
        super.request();
    }
}
