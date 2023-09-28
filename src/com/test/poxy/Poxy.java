package com.test.poxy;

/**
 * @Author Lc
 * @Date 2023/9/14
 * @PackageName: com.test.poxy
 * @ClassName: Poxy
 * @Description:
 */

public class Poxy implements IPoxy {

    private Pursuit gg;

    public Poxy(SchoolGirl mm) {
        this.gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        this.gg.giveDolls();
    }
}
