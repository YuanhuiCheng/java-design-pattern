package com.yuanhui.tutorial.chain;

public class GroupLeader extends Handler {
    public GroupLeader() {
        super(0, Handler.NUM_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest request) {
        System.out.println(request.getName() + " requests off for "
                + request.getDays() + " days; reason is "
                + request.getContent());
        System.out.println("leader approved");
    }
}
