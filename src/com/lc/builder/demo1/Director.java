package com.lc.builder.demo1;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description 指挥者类
 */
public class Director {
    //声明builder类型的变量
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    //组装自行车
    public Bilke construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
