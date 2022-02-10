package com.yuanhui.tutorial.factory._abstract;

public class HuaweiRouter implements RouterProduct {
    @Override
    public void start() {
        System.out.println("start huawei router");
    }

    @Override
    public void shutdown() {
        System.out.println("shut down huawei router");
    }

    @Override
    public void openWifi() {
        System.out.println("open wifi of huawei router");
    }

    @Override
    public void setting() {
        System.out.println("set up huawei router");
    }
}
