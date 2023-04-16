package com.lc.behavioralPattern.command;

import java.util.HashMap;

/**
 * @Author Lc
 * @Date 2023/4/12
 * @Description
 */
public class OrderCommand implements Command {
    private SeniorChef seniorChef;
    private Order order;

    public OrderCommand(SeniorChef seniorChef, Order order) {
        this.seniorChef = seniorChef;
        this.order = order;
    }

    @Override
    public void execute() {
        int diningTable = order.getDiningTable();
        HashMap<String, Integer> foodDic = order.getFoodDic();
        foodDic.forEach((key,value) ->{
            seniorChef.makeFood(value,key);
        });
    }
}
