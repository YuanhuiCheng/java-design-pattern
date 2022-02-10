package com.yuanhui.tutorial.proxy.staticdemo;

/**
 * 代理类
 * 代理类和目标类继承同一个接口
 */
public class DeliveryClerk2 implements OrderInterface {

    // 把原对象传入，保存到成员位置，也就是目标类对象
    private final OrderInterface source;

    public DeliveryClerk2(OrderInterface source) {
        this.source = source;
    }

    @Override
    public String order(String foodName) {
        String result = source.order(foodName);
        System.out.println("Order accepted, on the way to restaurant ...");
        System.out.println("Got your food, on the way to your place ...");
        return result + ", almost done";
    }
}
