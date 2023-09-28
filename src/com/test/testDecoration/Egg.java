package com.test.testDecoration;

/**
 * @Author Lc
 * @Date 2023/5/13
 * @Description
 */
public class Egg extends AbsDecoration {

    public Egg(AbsBattercake absBattercake) {
        super(absBattercake);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + "一个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
