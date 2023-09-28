package com.test.dectorator.dectorator0;

/**
 * @Author Lc
 * @Date 2023/9/13
 * @PackageName: com.test.dectorator.dectorator0
 * @ClassName: Person
 * @Description:
 */

public class Person implements Finery {

    private String name;

    public Person(String name) {
        this.name = name;
    }


    @Override
    public void show() {
        System.out.println("装扮的" + name);
    }
}
