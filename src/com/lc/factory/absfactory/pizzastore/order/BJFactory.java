package com.lc.factory.absfactory.pizzastore.order;

import com.lc.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.lc.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.lc.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @Author Lc
 * @Date 2023/4/9
 * @Description
 */
//工厂子类
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
