package com.yuanhui.tutorial.observer;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();

        // 订阅公众号
        subject.attach(new WechatUser("Dawn"));
        subject.attach(new WechatUser("Jack"));

        subject.notify("hello all");
    }
}
