package com.yuanhui.tutorial.prototype.demo2;

import java.util.Date;

/**
 * 视频类
 * <p>
 * 实现拷贝
 * 1. 实现接口
 * 2. 重写方法
 */
public class Video implements Cloneable {
    private String name;
    private Date createTime;

    public Video() {
    }

    public Video(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 深拷贝
        // 除了设置属性的方法，也可以序列化/反序列化，但是效率低
        Object obj = super.clone();

        Video v = (Video) obj;
        // 讲对象的属性进行克隆
        v.createTime = (Date) this.createTime.clone();
        return obj;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
