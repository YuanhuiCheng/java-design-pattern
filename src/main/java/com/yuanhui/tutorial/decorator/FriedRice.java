package com.yuanhui.tutorial.decorator;

/**
 * 具体构件角色 Concrete Component
 */
public class FriedRice extends FastFood {
    public FriedRice() {
        super(10, "fried rice");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
