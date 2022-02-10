package com.yuanhui.tutorial.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 请求者/调用者
 */
public class Waiter {
    // 持有多个命令对象
    private final List<Command> commands = new ArrayList<>();

    public void setCommand(Command cmd) {
        commands.add(cmd);
    }

    public void orderUp() {
        System.out.println("new order is coming");
        for (Command cmd : commands) {
            if (cmd != null) {
                cmd.execute();
            }
        }
    }
}
