package com.lc.StructuralPatterns.decorator.demo1;

/**
 * @Author Lc
 * @Date 2023/4/11
 * @Description 鸡蛋类 具体装饰者角色
 */
public class Egg extends Garnish{


    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    @Override
    public float cost() {
        return getFastFood().getPrice() + getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
