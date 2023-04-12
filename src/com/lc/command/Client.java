package com.lc.command;

import java.util.HashMap;

/**
 * @Author Lc
 * @Date 2023/4/12
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        stringIntegerHashMap.put("汉堡",1);
        order.setFoodDic(stringIntegerHashMap);
        Waitor waitor = new Waitor();
        SeniorChef seniorChef = new SeniorChef();
        waitor.OrderUp(new OrderCommand(seniorChef,order));
    }
}
