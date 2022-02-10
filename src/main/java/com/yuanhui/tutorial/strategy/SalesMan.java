package com.yuanhui.tutorial.strategy;

/**
 * 环境类，聚合策略类
 */
public class SalesMan {
    private final Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void salesManShow() {
        strategy.show();
    }
}
