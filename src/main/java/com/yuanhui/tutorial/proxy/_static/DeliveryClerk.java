package com.yuanhui.tutorial.proxy._static;

/**
 * 代理类
 * 代理类继承目标类
 */
public class DeliveryClerk extends Customer {
    @Override
    public String order(String foodName) {
        String result = super.order(foodName);
        System.out.println("Order accepted, on the way to restaurant ...");
        System.out.println("Got your food, on the way to your place ...");
        return result+", almost done";
    }
}
