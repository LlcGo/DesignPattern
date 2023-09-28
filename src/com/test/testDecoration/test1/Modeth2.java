package com.test.testDecoration.test1;

/**
 * @Author Lc
 * @Date 2023/5/13
 * @Description
 */
public class Modeth2 extends ModethZS {
    public Modeth2(AbsModeth absModeth) {
        super(absModeth);
    }

    @Override
    void m1() {
        super.m1();
        System.out.println("增加的方法");
    }
}
