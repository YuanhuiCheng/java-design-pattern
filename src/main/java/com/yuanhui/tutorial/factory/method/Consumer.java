package com.yuanhui.tutorial.factory.method;

/**
 * 结构复杂度：simple优先
 * 代码复杂度：simple
 * 编程复杂度：simple
 * 管理复杂度：simple
 *
 * 根据设计原则：工厂方法模式
 * 根据实际业务：简单工厂模式
 */
public class Consumer {
    public static void main(String[] args) {
        Car car = new AudiFactory().getCar();
        Car car2 = new TeslaFactory().getCar();
    }
}
