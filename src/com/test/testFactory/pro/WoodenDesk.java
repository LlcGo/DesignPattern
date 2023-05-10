package com.test.testFactory.pro;

/**
 * @Author Lc
 * @Date 2023/5/8
 * @Description
 */
public class WoodenDesk implements Desk {
    private String name;

    public WoodenDesk() {
        this.name = "木制桌子";
    }

    @Override
    public String getDesk() {
        return this.name;
    }
}
