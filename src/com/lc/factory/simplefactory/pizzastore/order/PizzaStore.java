package com.lc.factory.simplefactory.pizzastore.order;

/**
 * @Author Lc
 * @Date 2023/4/9
 * @Description
 */
//客户端
public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza();

        //使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println("退出程序");
    }
}
