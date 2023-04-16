package com.lc.behavioralPattern.mediator;

/**
 * @Author Lc
 * @Date 2023/4/14
 * @Description 抽象同事累
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
