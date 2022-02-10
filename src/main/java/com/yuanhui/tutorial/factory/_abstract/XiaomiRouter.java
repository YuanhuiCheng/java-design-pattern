package com.yuanhui.tutorial.factory._abstract;

public class XiaomiRouter implements RouterProduct {
    @Override
    public void start() {
        System.out.println("start xiaomi router");
    }

    @Override
    public void shutdown() {
        System.out.println("shut down xiaomi router");
    }

    @Override
    public void openWifi() {
        System.out.println("open wifi of xiaomi router");
    }

    @Override
    public void setting() {
        System.out.println("set up xiaomi router");
    }
}
