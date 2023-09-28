package com.test.dectorator;

import com.test.dectorator.ConcreteDecorateor.TShirts;
import com.test.dectorator.finery.Finery;

/**
 * @Author Lc
 * @Date 2023/9/13
 * @PackageName: com.test.dectorator
 * @ClassName: main
 * @Description:
 */

public class maingo {
    public static void main(String[] args) {
        Person person = new Person("小李");
        TShirts tShirts = new TShirts();
        tShirts.decorate(person);
        TShirts tShirts1 = new TShirts();
        tShirts1.decorate(tShirts);
        tShirts1.show();
    }
}
