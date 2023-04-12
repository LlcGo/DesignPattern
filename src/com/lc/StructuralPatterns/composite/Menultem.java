package com.lc.StructuralPatterns.composite;

/**
 * @Author Lc
 * @Date 2023/4/12
 * @Description 菜单项 ：叶子节点
 */
public class Menultem extends MenuComponent {

    public Menultem(String name,int level) {
           this.name = name;
           this.level = level;
    }

    @Override
    protected void print() {
        System.out.println(name);
    }
}
