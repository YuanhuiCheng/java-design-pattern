package com.yuanhui.tutorial.state;

public class OpeningState extends LiftState {
    @Override
    public void open() {
        System.out.println("opening");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.close();
    }

    @Override
    public void run() {
        // do nothing
    }

    @Override
    public void stop() {
        // do nothing
    }
}
