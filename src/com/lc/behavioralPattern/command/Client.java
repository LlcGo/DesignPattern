package com.lc.behavioralPattern.command;

import java.util.HashMap;

/**
 * @Author Lc
 * @Date 2023/4/12
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        //订单下单
        Order order = new Order();
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        stringIntegerHashMap.put("汉堡",1);
        order.setFoodDic(stringIntegerHashMap);
        //服务员
        Waitor waitor = new Waitor();
        //厨师
        SeniorChef seniorChef = new SeniorChef();
        //服务员拿到单告诉厨师
        waitor.OrderUp(new OrderCommand(seniorChef,order));
    }
}
