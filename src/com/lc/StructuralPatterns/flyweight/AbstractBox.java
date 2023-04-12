package com.lc.StructuralPatterns.flyweight;

/**
 * @Author Lc
 * @Date 2023/4/12
 * @Description 抽象享元角色
 */
public abstract class AbstractBox {

    public abstract String getShape();

    public void display(String color){
        System.out.println("方块形状" + getShape() + "颜色" + color);
    }
}
