package com.yuanhui.tutorial.command;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private final Map<String, Integer> foodDir = new HashMap<>();
    private int diningTable;

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name, int num) {
        foodDir.put(name, num);
    }
}
