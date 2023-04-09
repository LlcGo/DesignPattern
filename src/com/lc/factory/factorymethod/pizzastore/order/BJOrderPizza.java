package com.lc.factory.factorymethod.pizzastore.order;

import com.lc.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.lc.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.lc.factory.factorymethod.pizzastore.pizza.Pizza;

import java.util.concurrent.ExecutorService;

/**
 * @Author Lc
 * @Date 2023/4/9
 * @Description
 */
public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
