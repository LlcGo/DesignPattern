package com.lc.StructuralPatterns.decorator.demo1;

import java.util.LinkedList;

/**
 * @Author Lc
 * @Date 2023/4/11
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        FastFood frideRice = new FrideRice();
        System.out.println(frideRice.getDesc() + frideRice.cost());
        System.out.println("==================");
        frideRice = new Egg(frideRice);
        System.out.println(frideRice.getDesc() + frideRice.cost());
        System.out.println("==================");
    }
}
