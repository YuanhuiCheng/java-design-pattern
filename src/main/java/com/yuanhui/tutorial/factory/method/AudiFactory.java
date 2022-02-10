package com.yuanhui.tutorial.factory.method;

public class AudiFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Audi();
    }
}
