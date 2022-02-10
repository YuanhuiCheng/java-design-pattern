package com.yuanhui.tutorial.chain;

public class GeneralManager extends Handler {
    public GeneralManager() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest request) {
        System.out.println(request.getName() + " requests off for "
                + request.getDays() + " days; reason is "
                + request.getContent());
        System.out.println("general manager approved");
    }
}
