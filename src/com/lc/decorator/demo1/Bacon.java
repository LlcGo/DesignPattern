package com.lc.decorator.demo1;

/**
 * @Author Lc
 * @Date 2023/4/11
 * @Description 培根类 (具体装饰着角色)
 */
public class Bacon extends Garnish {


    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
