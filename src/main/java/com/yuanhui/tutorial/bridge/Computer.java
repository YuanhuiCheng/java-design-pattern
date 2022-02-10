package com.yuanhui.tutorial.bridge;

/**
 * 抽象电脑类，可以是abstract class
 */
public abstract class Computer {
    // 组合，品牌，桥bridge
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info() {
        brand.info();
    }
}

class Desktop extends Computer {
    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("desktop");
    }
}

class Laptop extends Computer {
    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("laptop");
    }
}
