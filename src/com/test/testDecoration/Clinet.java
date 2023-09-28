package com.test.testDecoration;


/**
 * @Author Lc
 * @Date 2023/5/13
 * @Description
 */
public class Clinet {
    public static void main(String[] args) {
        AbsBattercake absBattercake = new Battercake();
        absBattercake = new Egg(absBattercake);
        absBattercake = new Egg(absBattercake);
        absBattercake = new Egg(absBattercake);
        absBattercake = new Egg(absBattercake);
        System.out.println(absBattercake.getMsg());
    }
}
