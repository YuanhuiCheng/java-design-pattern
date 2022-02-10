package com.yuanhui.tutorial.chain;

public class LeaveRequest {
    private final String name;
    private final int days;
    private final String content;

    public LeaveRequest(String name, int days, String content) {
        this.name = name;
        this.days = days;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public String getContent() {
        return content;
    }
}
