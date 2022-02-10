package com.yuanhui.tutorial.template;

public abstract class AbstractClass {
    // template method, 无法被重写
    public final void cookProcess() {
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    public void pourOil() {
        System.out.println("pour oil");
    }

    public void heatOil() {
        System.out.println("heat oil");
    }

    public void fry() {
        System.out.println("fry ");
    }

    public abstract void pourVegetable();

    public abstract void pourSauce();
}
