package com.lc.builderpattern.factory.absfactory.pizzastore.order;

import com.lc.builderpattern.factory.absfactory.pizzastore.pizza.*;

/**
 * @Author Lc
 * @Date 2023/4/9
 * @Description
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
