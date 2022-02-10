package com.yuanhui.tutorial.composite;

/**
 * 菜单组件，抽象根节点
 */
public abstract class MenuComponent {
    protected String name;
    protected int level;

    // 添加子菜单
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    // 打印菜单名称的方法（包含子菜单和子菜单项）
    public abstract void printName();
}
