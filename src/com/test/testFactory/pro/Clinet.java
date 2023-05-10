package com.test.testFactory.pro;

/**
 * @Author Lc
 * @Date 2023/5/8
 * @Description
 */
public class Clinet {
    public static void main(String[] args) {
        DeskFactory factroy = new WoodenDeskFactroy();
        System.out.println(factroy.createDesk());
    }
}
