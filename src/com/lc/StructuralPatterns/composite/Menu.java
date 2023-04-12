package com.lc.StructuralPatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lc
 * @Date 2023/4/12
 * @Description 菜单
 */
public class Menu  extends MenuComponent{
    private List<MenuComponent> menuComponentList = new ArrayList<>();

    public Menu(String name,int level){
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponentList.get(i);
    }

    @Override
    protected void print() {
        System.out.println(name);
        menuComponentList.forEach(MenuComponent::print);
    }
}
