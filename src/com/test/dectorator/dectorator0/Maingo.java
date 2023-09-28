package com.test.dectorator.dectorator0;

/**
 * @Author Lc
 * @Date 2023/9/13
 * @PackageName: com.test.dectorator.dectorator0
 * @ClassName: Maingo
 * @Description:
 */

public class Maingo {
    public static void main(String[] args) {
        Finery person = new Person("小明");
        person.show();
        Finery tShirt = new TShirt();
        tShirt.show();
    }
}
