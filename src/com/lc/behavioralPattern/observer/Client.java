package com.lc.behavioralPattern.observer;

/**
 * @Author Lc
 * @Date 2023/4/13
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        //1.创建公众号对象
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        //2.订阅公众号
        subscriptionSubject.attach(new WeixinUser("小明"));
        subscriptionSubject.attach(new WeixinUser("小军"));
        subscriptionSubject.attach(new WeixinUser("小白"));

        //3.公众号更新
        subscriptionSubject.notify("更新信息");
    }
}
