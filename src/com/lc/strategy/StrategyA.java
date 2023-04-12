package com.lc.strategy;

/**
 * @Author Lc
 * @Date 2023/4/12
 * @Description
 */
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("策略A");
    }
}
