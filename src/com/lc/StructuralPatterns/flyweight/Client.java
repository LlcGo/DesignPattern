package com.lc.StructuralPatterns.flyweight;

/**
 * @Author Lc
 * @Date 2023/4/12
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        AbstractBox box1 = BoxFactory.getInstance().getBox("L");
        box1.display("灰色");

        AbstractBox box2 = BoxFactory.getInstance().getBox("I");
        box2.display("灰色");

        AbstractBox box3 = BoxFactory.getInstance().getBox("O");
        box3.display("灰色");

        AbstractBox box4 = BoxFactory.getInstance().getBox("L");
        box4.display("灰色");

        System.out.println(box1 == box4);
    }
}
