package com.test.poxy;

/**
 * @Author Lc
 * @Date 2023/9/14
 * @PackageName: com.test.poxy
 * @ClassName: Pursuit
 * @Description:
 */

public class Pursuit implements IPoxy{

    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    public void giveDolls(){
        System.out.println(mm.getName() + "我送你洋娃娃");
    }
}
