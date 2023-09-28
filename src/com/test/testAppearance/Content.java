package com.test.testAppearance;

/**
 * @Author Lc
 * @Date 2023/5/17
 * @Description
 */
public class Content {
    private Method1 method1 = new Method1();
    private Method2 method2 = new Method2();
    private Method3 method3 = new Method3();

    public void m1(){
        method1.m1();
        method2.m2();
    }

    public void m2(){
        method2.m2();
        method3.m3();
    }
}
