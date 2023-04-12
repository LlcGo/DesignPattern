package com.lc.StructuralPatterns.proxy.jdk_proxy;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description 火车站类
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站买票");
    }
}
