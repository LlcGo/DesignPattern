package com.lc.behavioralPattern.status.after;

/**
 * @Author Lc
 * @Date 2023/4/13
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new OpenningState());

        context.open();
    }
}
