package com.yuanhui.tutorial.factory.simple;

public class Consumer {
    public static void main(String[] args) {
        Car car = CarFactory.getCar("Tesla");
    }
}
