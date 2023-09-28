package com.Design.builder;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @Author Lc
 * @Date 2023/9/19
 * @PackageName: com.Design.builder
 * @ClassName: FatPerson
 * @Description:
 */

public class FatPerson extends Builder{

    public void head() {
        System.out.println("胖的人的手");
    }


    public void body() {
        System.out.println("胖的人的身体");
    }


    public void leg() {
        System.out.println("胖的人的腿");
    }
}
