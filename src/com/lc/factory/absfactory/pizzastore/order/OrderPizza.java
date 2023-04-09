package com.lc.factory.absfactory.pizzastore.order;

import com.lc.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author Lc
 * @Date 2023/4/9
 * @Description
 */
public class OrderPizza {
    AbsFactory factory;
    //构造器

    public OrderPizza(AbsFactory factory) {
        setAbsFactory(factory);
    }

    private void setAbsFactory(AbsFactory absFactory){
        Pizza pizza = null;
        String orderType = ""; //用户输入
        this.factory = absFactory;
        do {
            orderType = getType();
            //factory可能是伦敦的也可能是北京的
            pizza = factory.createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                //...
            }
        }while (true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";}
    }
}
