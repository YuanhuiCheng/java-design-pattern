package com.yuanhui.tutorial.factory.simple;

/**
 * 简单工厂/静态工厂模式
 */
public class CarFactory {
    public static Car getCar(String car) {
        if ("Audi".equals(car)) {
            return new Audi();
        } else if ("Tesla".equals(car)) {
            return new Tesla();
        }
        // 随着越来越多品牌的加入，每次都要在此处修改代码。因此，简单工厂不满足开闭原则。
        return null;
    }
}
