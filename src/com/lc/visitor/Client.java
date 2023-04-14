package com.lc.visitor;

/**
 * @Author Lc
 * @Date 2023/4/14
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Home home = new Home();
        home.add(cat);
        home.add(dog);
        Owner owner = new Owner();
        home.action(owner);
    }
}
