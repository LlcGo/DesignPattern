package com.lc.StructuralPatterns.composite;

/**
 * @Author Lc
 * @Date 2023/4/12
 * @Description 菜单组件 ： 属于抽象根节点
 */
public abstract class MenuComponent {
    protected String name;
    protected int level;

   public void add(MenuComponent menuComponent){
       throw new UnsupportedOperationException();
   };

   public void remove(MenuComponent menuComponent){
       throw new UnsupportedOperationException();
   };

   public MenuComponent getChild(int i){
       throw new UnsupportedOperationException();
   }

    public String getName() {
        return name;
    }


    public int getLevel() {
        return level;
    }

    protected abstract void print();
}
