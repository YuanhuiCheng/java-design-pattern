package com.yuanhui.tutorial.facade;

public class Client {
    public static void main(String[] args) {
        SmartApplianceFacade facade = new SmartApplianceFacade();
        facade.say("turn on");
        facade.say("turn off");
    }
}
