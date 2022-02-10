package com.yuanhui.tutorial.proxy.dynamicdemo.jdk;

import java.lang.reflect.Proxy;

public class DynamicDemo {
    public static void main(String[] args) {
        Customer customer = new Customer();
        // 使用jdk的api，动态的生成一个代理对象
        OrderInterface deliveryClerk = (OrderInterface) Proxy.newProxyInstance(
                customer.getClass().getClassLoader(),
                customer.getClass().getInterfaces(),
                (proxy, method, args1) -> {
                    if ("order".equals(method.getName())) {
                        Object result = method.invoke(customer, args1);
                        System.out.println("Order accepted, on the way to restaurant ...");
                        System.out.println("Got your food, on the way to your place ...");
                        return result + ", almost done";
                    } else {
                        return method.invoke(customer, args1); // 在原对象中执行该方法，逻辑原封不动
                    }
                });
        // 调用代理对象，执行对应方法
        String result = deliveryClerk.order("fried rice");
        System.out.println(result);
    }
}
