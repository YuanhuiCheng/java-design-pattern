package com.yuanhui.tutorial.decorator;

/**
 * 具体装饰者角色 Concrete Decorator
 */
public class Egg extends Garnish {
    public Egg(FastFood fastFood) {
        super(fastFood, 1, "egg");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " " + getFastFood().getDesc();
    }
}
