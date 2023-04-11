package com.lc.builderpattern.factory.simplefactory.pizzastore.order;

import com.lc.builderpattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.lc.builderpattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.lc.builderpattern.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @Author Lc
 * @Date 2023/4/9
 * @Description
 */
public class SimpleFactory {
    //根据orderType返回一个对应pizza
    public Pizza createPizza(String orderType) {
        System.out.println("使用简单工厂模式");
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }
        return pizza;
    }
}
