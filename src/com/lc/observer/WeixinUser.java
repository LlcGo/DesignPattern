package com.lc.observer;

/**
 * @Author Lc
 * @Date 2023/4/13
 * @Description 观察者
 */
public class WeixinUser implements Observer {
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
