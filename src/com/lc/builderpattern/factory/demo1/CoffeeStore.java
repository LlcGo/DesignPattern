package com.lc.builderpattern.factory.demo1;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description
 */
public class CoffeeStore {

    private CoffeFactory coffeFactory;

    public CoffeeStore(CoffeFactory coffeFactory) {
        this.coffeFactory = coffeFactory;
    }

    public Coffee orderCoffee(String type){
        return coffeFactory.orderCoffee(type);
    }
}
