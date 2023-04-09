package com.lc.factory.factorymethod.pizzastore.order;

import com.lc.factory.factorymethod.pizzastore.pizza.*;

/**
 * @Author Lc
 * @Date 2023/4/9
 * @Description
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
