package com.lc.decorator.demo1;

/**
 * @Author Lc
 * @Date 2023/4/11
 * @Description 炒饭 具体构建角色
 */
public class FrideRice extends FastFood{


    public FrideRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
