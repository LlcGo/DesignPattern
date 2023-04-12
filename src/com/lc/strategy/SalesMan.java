package com.lc.strategy;

/**
 * @Author Lc
 * @Date 2023/4/12
 * @Description
 */
public class SalesMan {
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void salesManeShow(){
        strategy.show();
    }
}
