package com.lc.factory.demo1;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description
 */
public abstract class Coffee {
    private String name;

    String getName() {
        return name;
    }

     void addMilk(){
         System.out.println("加牛奶");
     };

     void addSugar(){
         System.out.println("加唐");
     };

}
