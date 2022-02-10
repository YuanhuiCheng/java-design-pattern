package com.yuanhui.tutorial.template;

public class ConcreteClassBroccoli extends AbstractClass {

    @Override
    public void pourVegetable() {
        System.out.println("vegetable is broccoli");
    }

    @Override
    public void pourSauce() {
        System.out.println("source is ranch");
    }
}
