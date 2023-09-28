package com.test.dectorator;

import com.test.dectorator.finery.Finery;
import com.test.dectorator.service.ICharacter;

/**
 * @Author Lc
 * @Date 2023/9/13
 * @PackageName: com.test.dectorator
 * @ClassName: Person
 * @Description:
 */

public class Person implements ICharacter {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("装扮的" + name);
    }
}
