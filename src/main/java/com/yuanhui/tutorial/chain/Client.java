package com.yuanhui.tutorial.chain;

public class Client {
    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest("Dawn", 5, "don't feel well");

        GroupLeader leader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        leader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        leader.submit(request);
    }
}
