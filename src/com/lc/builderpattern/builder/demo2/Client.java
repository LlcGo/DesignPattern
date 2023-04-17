package com.lc.builderpattern.builder.demo2;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        //创建手机对象
        //Phone phone = new Phone();
        Phone phone = new Phone
                .Budiler()
                .scree("三星屏幕")
                .budile();
        System.out.println(phone);
    }
}
