package com.lc.builderpattern.builder.demo1;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description
 */
public abstract class Builder {
      //声明bilke类型的变量，并进行赋值
    protected Bilke bilke = new Bilke();

    public abstract void buildFrame();

    public abstract void buildSeat();

    //构建自行车的方法
    public abstract Bilke createBike();
}
