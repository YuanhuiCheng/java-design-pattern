package com.yuanhui.tutorial.composite;

/**
 * 菜单项类，叶子节点
 */
public class MenuItem extends MenuComponent {
    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void printName() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        // 打印菜单项名称
        System.out.println(name);
    }
}
