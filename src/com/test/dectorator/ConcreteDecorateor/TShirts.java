package com.test.dectorator.ConcreteDecorateor;

import com.test.dectorator.finery.Finery;
import com.test.dectorator.service.ICharacter;

/**
 * @Author Lc
 * @Date 2023/9/13
 * @PackageName: com.test.dectorator.ConcreteDecorateor
 * @ClassName: Tshirts
 * @Description:
 */

public class TShirts extends Finery {

    @Override
    public void show() {
        super.show();
        System.out.println("大T Shirts");
    }

}
