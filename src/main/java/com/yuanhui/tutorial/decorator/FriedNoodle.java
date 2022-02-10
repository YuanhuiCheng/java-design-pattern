package com.yuanhui.tutorial.decorator;

public class FriedNoodle extends FastFood {
    public FriedNoodle() {
        super(12, "fried noodle");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
