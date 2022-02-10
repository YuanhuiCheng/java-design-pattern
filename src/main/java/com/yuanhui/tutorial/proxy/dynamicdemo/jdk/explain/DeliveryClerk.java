package com.yuanhui.tutorial.proxy.dynamicdemo.jdk.explain;

import com.yuanhui.tutorial.proxy.dynamicdemo.jdk.OrderInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 在此处模拟 newProxyInstance(ClassLoader loader,
 * Class<?>[] interfaces,
 * InvocationHandler h)
 */
public class DeliveryClerk implements OrderInterface {

    // 接收外部传递进来的InvocationHandler对象
    private final InvocationHandler handler;

    public DeliveryClerk(InvocationHandler handler) {
        this.handler = handler;
    }

    @Override
    public String order(String foodName) {
        try {
            Method method = OrderInterface.class.getMethod("order", String.class);
            Object result = handler.invoke(this, method, new Object[]{foodName});
            return (String) result;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    @Override
    public void test() {

    }

    @Override
    public void test2() {

    }
}
