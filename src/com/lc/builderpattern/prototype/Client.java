package com.lc.builderpattern.prototype;

/**
 * @Author Lc
 * @Date 2023/4/9
 * @Description
 */
public class Client {
    //传统方法
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep1 = new Sheep(sheep.getName() ,sheep.getAge(), sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName() ,sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName() ,sheep.getAge(), sheep.getColor());
        //...
    }

}
