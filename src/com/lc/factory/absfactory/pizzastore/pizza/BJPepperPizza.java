package com.lc.factory.absfactory.pizzastore.pizza;

/**
 * @Author Lc
 * @Date 2023/4/9
 * @Description
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的胡椒pizza");
        System.out.println("北京的胡椒pizza 准备原材料");
    }
}
