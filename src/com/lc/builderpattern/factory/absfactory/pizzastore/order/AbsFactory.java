package com.lc.builderpattern.factory.absfactory.pizzastore.order;

import com.lc.builderpattern.factory.absfactory.pizzastore.pizza.Pizza;

//抽象工厂模式的抽象层
public interface AbsFactory {
    //让下面的工厂子类具体实现
    Pizza createPizza(String orderType);
}
