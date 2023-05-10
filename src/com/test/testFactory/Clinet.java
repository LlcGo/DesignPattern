package com.test.testFactory;

/**
 * @Author Lc
 * @Date 2023/5/8
 * @Description
 */
public class Clinet {
    public static void main(String[] args) {
        Desk desk = DeskFactroy.create(Type.PlasticDesk);
        System.out.println(desk.getDesk());
    }
}
