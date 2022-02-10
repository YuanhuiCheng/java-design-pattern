package com.yuanhui.tutorial.factory._abstract;

public class HuaweiPhone implements PhoneProduct {
    @Override
    public void start() {
        System.out.println("start up huawei phone");
    }

    @Override
    public void shutdown() {
        System.out.println("shut down huawei phone");
    }

    @Override
    public void call() {
        System.out.println("xiaomi huawei calls");
    }

    @Override
    public void message() {
        System.out.println("xiaomi huawei messages");
    }
}
