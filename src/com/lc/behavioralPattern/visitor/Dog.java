package com.lc.behavioralPattern.visitor;

/**
 * @Author Lc
 * @Date 2023/4/14
 * @Description
 */
public class Dog implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好吃。。旺旺阿旺");
    }
}
