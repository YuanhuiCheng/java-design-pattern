package com.yuanhui.tutorial.chain;

public class Manager extends Handler {
    public Manager() {
        super(NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest request) {
        System.out.println(request.getName() + " requests off for "
                + request.getDays() + " days; reason is "
                + request.getContent());
        System.out.println("manager approved");
    }
}
