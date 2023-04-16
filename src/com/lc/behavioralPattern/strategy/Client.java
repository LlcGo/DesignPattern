package com.lc.behavioralPattern.strategy;

/**
 * @Author Lc
 * @Date 2023/4/12
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManeShow();
    }
}
