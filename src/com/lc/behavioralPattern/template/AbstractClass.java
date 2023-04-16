package com.lc.behavioralPattern.template;

/**
 * @Author Lc
 * @Date 2023/4/12
 * @Description
 */
public abstract class AbstractClass {

    public void cookProcess(){
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    public void pourOil(){
        System.out.println("倒油");
    }

    public void heatOil(){
        System.out.println("热油");
    }

    public abstract void pourVegetable();

    public abstract void pourSauce();

    public void fry(){
        System.out.println("翻炒");
    }
}
