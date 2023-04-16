package com.lc.behavioralPattern.template;

/**
 * @Author Lc
 * @Date 2023/4/12
 * @Description
 */
public class ConcreteClass_BaoCai extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("倒入包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("倒入抄包菜的调料");
    }
}
