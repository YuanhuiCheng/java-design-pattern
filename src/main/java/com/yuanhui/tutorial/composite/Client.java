package com.yuanhui.tutorial.composite;

public class Client {
    public static void main(String[] args) {
        // 创建菜单树
        MenuComponent menu1 = new Menu("menu management", 2);
        menu1.add(new MenuItem("visit page", 3));
        menu1.add(new MenuItem("expand menu", 3));
        menu1.add(new MenuItem("edit menu", 3));
        menu1.add(new MenuItem("delete menu", 3));
        menu1.add(new MenuItem("add menu", 3));

        MenuComponent menu2 = new Menu("permission management", 2);
        menu2.add(new MenuItem("visit page", 3));
        menu2.add(new MenuItem("commit and save", 3));

        MenuComponent menu3 = new Menu("role management", 2);
        menu3.add(new MenuItem("visit page", 3));
        menu3.add(new MenuItem("add role", 3));
        menu3.add(new MenuItem("edit role", 3));

        MenuComponent component = new Menu("system management", 1);
        component.add(menu1);
        component.add(menu2);
        component.add(menu3);

        component.printName();
    }
}
