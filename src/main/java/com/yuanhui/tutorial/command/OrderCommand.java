package com.yuanhui.tutorial.command;

import java.util.Map;

/**
 * 具体命令类
 */
public class OrderCommand implements Command {
    // 具体命令类持有接收者对象
    private final SeniorChef receiver;
    private final Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + " table ordered");
        Map<String, Integer> foodDir = order.getFoodDir();
        for (String foodName : foodDir.keySet()) {
            receiver.makeFood(foodName, foodDir.get(foodName));
        }
        System.out.println(order.getDiningTable() + " table's meal is ready");
    }
}
