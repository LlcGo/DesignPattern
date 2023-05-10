package com.lc.StructuralPatterns.decorator.demo1;

/**
 * @Author Lc
 * @Date 2023/4/11
 * @Description 炒面 具体构建角色
 */
public class FriedNoodles extends FastFood{


    public FriedNoodles(float price, String desc) {
        super(9, "炒面");
    }

    //调用父类的getpricie
    @Override
    public float cost() {
        return getPrice();
    }
}
