package com.test.testobserver;

/**
 * @Author Lc
 * @Date 2023/5/16
 * @Description
 */
public class QQmessage implements Observer {
    @Override
    public String update() {
        return "推送qq消息";
    }
}
