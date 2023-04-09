package com.lc.factory.simplefactory.pizzastore.pizza;

/**
 * @Author Lc
 * @Date 2023/4/9
 * @Description
 */
public abstract class Pizza {
   private String name; //披萨名字

   public abstract void prepare();//准备原材料

   public void bake(){
       System.out.println(name + "baking");
   }

    public void cut(){
        System.out.println(name + "cuting");
    }

    public void box(){
        System.out.println(name + "boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
