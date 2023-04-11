package com.lc.builderpattern.factory.simplefactory.pizzastore.pizza;

/**
 * @Author Lc
 * @Date 2023/4/9
 * @Description
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("制作希腊披萨准备原材料");
    }
}
