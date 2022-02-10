package com.yuanhui.tutorial.prototype.demo1;

import java.util.Date;

/**
 * 客户端：克隆
 */
public class Bilibili {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 原型对象 v1
        Date date = new Date();
        Video v1 = new Video("java-tutorial", date);
        // v1 克隆 v2
        // 浅拷贝，Date没拷贝
        Video v2 = (Video) v1.clone();
        System.out.println("v1=>" + v1);
        System.out.println("v2=>" + v2);

        System.out.println("---");

        date.setTime(22132213);
        System.out.println("v1=>" + v1);
        System.out.println("v2=>" + v2);

//        System.out.println("v1=>hash:" + v1.hashCode());
//        System.out.println("v2=>hash:" + v2.hashCode());

//        v2.setName("clone: java-tutorial");
    }
}
