package com.test.testDecoration;

/**
 * @Author Lc
 * @Date 2023/5/13
 * @Description
 */
public abstract class AbsDecoration implements AbsBattercake {
    private AbsBattercake absBattercake;

    public AbsDecoration(AbsBattercake absBattercake) {
        this.absBattercake = absBattercake;
    }

    @Override
    public String getMsg() {
        return this.absBattercake.getMsg();
    }

    @Override
    public int getPrice() {
        return this.absBattercake.getPrice();
    }
}
