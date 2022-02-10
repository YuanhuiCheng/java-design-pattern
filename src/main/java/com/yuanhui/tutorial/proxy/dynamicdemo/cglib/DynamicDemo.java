package com.yuanhui.tutorial.proxy.dynamicdemo.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

public class DynamicDemo {
    public static void main(String[] args) {
        Customer customer = new Customer();
        // 使用CGLIB创建代理对象，代理类和目标类是父子关系
        Customer deliveryClerk = (Customer) Enhancer.create(Customer.class,
                (MethodInterceptor) (proxy, method, objects, methodProxy) -> {
                    if ("order".equals(method.getName())) {
                        Object result = method.invoke(customer, args);
                        return result + "; clean and safe";
                    } else {
                        return method.invoke(customer, args);
                    }
                });
        String result = deliveryClerk.order("fried rice");
        System.out.println(result);
    }
}
