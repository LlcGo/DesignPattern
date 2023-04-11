package com.lc.builderpattern.factory.demo1;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description
 */
public class CoffeFactory {
    Coffee coffee = null;
    public Coffee orderCoffee(String type){
        if("americano".equals(type)){
            coffee = new AmericanCoffee();
        }else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        }
        System.out.println(coffee.getName());
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
