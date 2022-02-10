package com.yuanhui.tutorial.adapter;

/**
 * 客户端类：向上网，但插不上网线
 */
public class Computer {
    public static void main(String[] args) {
        // 电脑，适配器，网线
        Computer computer = new Computer();
        Adaptee adaptee = new Adaptee(); // 网线
        // Adapter adapter = new Adapter(); // 转接器
        Adapter2 adapter2 = new Adapter2(adaptee);

        computer.net(adapter2);
    }

    // 电脑连上转接器才能上网
    public void net(NetToUsb adapter) {
        // 找一个转接头
        adapter.handleRequest();
    }
}
