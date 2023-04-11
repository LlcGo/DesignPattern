package com.lc.decorator.demo1;

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
