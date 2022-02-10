package com.yuanhui.tutorial.proxy._static;

public class StaticDemo {
    public static void main(String[] args) {
        // Customer customer = new Customer();
//        Customer customer = new DeliveryClerk();
//        String result = customer.order("fried rice");
//        System.out.println(result);

        Customer customer = new Customer();
        // 创建代理对象
        OrderInterface deliveryClerk = new DeliveryClerk2(customer);
        // 调用代理对象的方法，可以看到增强之后的效果
        String result = deliveryClerk.order("fries");
        System.out.println(result);
    }
}
