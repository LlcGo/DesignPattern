package com.test.testDecoration.test1;

/**
 * @Author Lc
 * @Date 2023/5/13
 * @Description
 */
public class ModethZS extends AbsModeth {
    private AbsModeth absModeth;

    public ModethZS(AbsModeth absModeth) {
        this.absModeth = absModeth;
    }

    @Override
    void m1() {
        this.absModeth.m1();
    }
}
