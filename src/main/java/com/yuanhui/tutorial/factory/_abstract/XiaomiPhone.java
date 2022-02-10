package com.yuanhui.tutorial.factory._abstract;

public class XiaomiPhone implements PhoneProduct {
    @Override
    public void start() {
        System.out.println("start up xiaomi phone");
    }

    @Override
    public void shutdown() {
        System.out.println("shut down xiaomi phone");
    }

    @Override
    public void call() {
        System.out.println("xiaomi phone calls");
    }

    @Override
    public void message() {
        System.out.println("xiaomi phone messages");
    }
}
