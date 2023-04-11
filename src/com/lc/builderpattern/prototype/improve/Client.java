package com.lc.builderpattern.prototype.improve;

/**
 * @Author Lc
 * @Date 2023/4/9
 * @Description
 */
//原型模式完成创建
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        System.out.println(sheep1 == sheep2);
        System.out.println(sheep1.hashCode());
        System.out.println(sheep2.hashCode()); //false
    }
}
