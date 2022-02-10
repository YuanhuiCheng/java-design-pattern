package com.yuanhui.tutorial.bridge;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Laptop(new Apple());
        computer.info();

        Computer computer2 = new Desktop(new Lenovo());
        computer2.info();
    }
}
