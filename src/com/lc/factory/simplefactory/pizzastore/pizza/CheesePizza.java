package com.lc.factory.simplefactory.pizzastore.pizza;

/**
 * @Author Lc
 * @Date 2023/4/9
 * @Description
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("制作奶酪披萨准备原材料");
    }
}
