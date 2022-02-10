package com.yuanhui.tutorial.decorator;

/**
 * 具体装饰者角色 Concrete Decorator
 */
public class Bacon extends Garnish {
    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "bacon");
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
