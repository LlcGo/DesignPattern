package com.lc.visitor;

/**
 * @Author Lc
 * @Date 2023/4/14
 * @Description
 */
public class Someone implements  Person {
    @Override
    public void feed(Cat cat) {
        System.out.println("陌生人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("陌生人喂食狗");
    }
}
