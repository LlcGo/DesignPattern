package com.lc.visitor;

/**
 * @Author Lc
 * @Date 2023/4/14
 * @Description
 */
public class Cat implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好吃，喵喵啊喵");
    }
}
