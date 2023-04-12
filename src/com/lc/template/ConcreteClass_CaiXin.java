package com.lc.template;

/**
 * @Author Lc
 * @Date 2023/4/12
 * @Description
 */
public class ConcreteClass_CaiXin extends AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("倒入菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("倒入抄菜心要用的调料");
    }
}
