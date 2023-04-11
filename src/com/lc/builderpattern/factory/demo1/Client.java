package com.lc.builderpattern.factory.demo1;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore(new CoffeFactory());
        coffeeStore.orderCoffee("americano");
    }
}
