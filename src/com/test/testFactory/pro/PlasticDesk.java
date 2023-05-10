package com.test.testFactory.pro;

/**
 * @Author Lc
 * @Date 2023/5/8
 * @Description
 */
public class PlasticDesk implements Desk {
    private String name;

    public PlasticDesk() {
        this.name = "塑料桌子";
    }

    @Override
    public String getDesk() {
        return this.name;
    }
}
