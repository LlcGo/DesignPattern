package com.test.testFactory.pro;

/**
 * @Author Lc
 * @Date 2023/5/8
 * @Description
 */
public class WoodenDeskFactroy implements DeskFactory {
    @Override
    public String createDesk() {
        return new WoodenDesk().getDesk();
    }
}
