package com.yuanhui.tutorial.command;

public class Client {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("fried rice", 1);
        order1.setFood("coke", 1);

        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("fried noodles", 1);
        order2.setFood("sprite", 1);

        SeniorChef receiver = new SeniorChef();
        OrderCommand cmd1 = new OrderCommand(receiver, order1);
        OrderCommand cmd2 = new OrderCommand(receiver, order2);

        Waiter invoker = new Waiter();
        invoker.setCommand(cmd1);
        invoker.setCommand(cmd2);
        invoker.orderUp();
    }
}
