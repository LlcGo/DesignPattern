package com.test.testobserver;

/**
 * @Author Lc
 * @Date 2023/5/16
 * @Description
 */
public class Wxmessage implements Observer {
    @Override
    public String update() {
        return "推送微信消息";
    }
}
