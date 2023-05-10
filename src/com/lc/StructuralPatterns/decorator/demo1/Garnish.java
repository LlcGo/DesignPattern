package com.lc.StructuralPatterns.decorator.demo1;

/**
 * @Author Lc
 * @Date 2023/4/11
 * @Description 装饰者类 抽象装饰者角色
 */
public abstract class Garnish extends FastFood{

    //组合fastfood 目的给这个的子类把他包起来使用
    private FastFood fastFood;

    public Garnish(FastFood fastFood,float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    //就要抱起来就要有get方法来获取价钱然后加起来
    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
