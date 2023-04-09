package com.lc.factory.factorymethod.pizzastore.pizza;

/**
 * @Author Lc
 * @Date 2023/4/9
 * @Description
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的奶酪pizza");
        System.out.println("伦敦的奶酪pizza 准备原材料");
    }
}
