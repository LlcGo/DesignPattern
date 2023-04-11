package com.lc.builderpattern.factory.factorymethod.pizzastore.order;

import com.lc.builderpattern.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author Lc
 * @Date 2023/4/9
 * @Description
 */
public abstract class OrderPizza {

    //定义一个抽象方法,createPizza
    abstract Pizza createPizza(String orderType);

    // 构造器
    public OrderPizza(){
        Pizza pizza = null;
        String orderType;//定制披萨类型
        do {
            orderType = getType();
            pizza = createPizza(orderType); //抽象方法由工厂子类完成
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }


    //定义一个简单工厂对象
//    SimpleFactory simpleFactory;
//    Pizza pizza = null;
//
//    //构造器
//    public OrderPizza(SimpleFactory simpleFactory){
//        setSimpleFactory(simpleFactory);
//    }
//
//    public void setSimpleFactory(SimpleFactory simpleFactory){
//
//        String orderType = "";//用户输入
//
//        this.simpleFactory = simpleFactory;//设置简单工厂对象
//
//        do {
//            orderType = getType();
//            pizza = this.simpleFactory.createPizza(orderType);
//            if(pizza != null){
//                pizza.prepare();
//                pizza.box();
//            }else {
//                System.out.println("订购披萨失败");
//                break;
//            }
//        }while (true);
//    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";}}
}


