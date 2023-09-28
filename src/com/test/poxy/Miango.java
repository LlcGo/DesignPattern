package com.test.poxy;

/**
 * @Author Lc
 * @Date 2023/9/14
 * @PackageName: com.test.poxy
 * @ClassName: Miango
 * @Description:
 */

public class Miango {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl("李娇娇");
        Poxy poxy = new Poxy(schoolGirl);
        poxy.giveDolls();
    }
}
