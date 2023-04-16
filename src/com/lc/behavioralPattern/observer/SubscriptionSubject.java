package com.lc.behavioralPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lc
 * @Date 2023/4/13
 * @Description 具体主题角色类
 */
public class SubscriptionSubject  implements Subject {
    List<Observer> weixinUserList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
         weixinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
         weixinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
         weixinUserList.forEach(weixin -> weixin.update(message));
    }
}
