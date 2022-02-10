package com.yuanhui.tutorial.proxy.dynamic.cglib.explain;

import com.yuanhui.tutorial.proxy.dynamic.cglib.Customer;
import net.sf.cglib.proxy.MethodInterceptor;

import java.lang.reflect.Method;

public class DeliveryClerk extends Customer {

    private final MethodInterceptor methodInterceptor;

    public DeliveryClerk(MethodInterceptor methodInterceptor) {
        this.methodInterceptor = methodInterceptor;
    }

    @Override
    public String order(String foodName) {
        Method method;
        try {
            method = Customer.class.getMethod("order", String.class);
            Object result = methodInterceptor.intercept(this, method, new Object[]{foodName}, null);
            return (String) result;
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return super.order(foodName);
    }
}
