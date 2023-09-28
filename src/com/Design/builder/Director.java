package com.Design.builder;

/**
 * @Author Lc
 * @Date 2023/9/19
 * @PackageName: com.Design.builder
 * @ClassName: Diector
 * @Description:
 */

public class Director {


    public Director(Builder builder){
        builder.body();
        builder.head();
        builder.leg();
    }

}
