package com.lc.StructuralPatterns.flyweight;

import java.util.HashMap;

/**
 * @Author Lc
 * @Date 2023/4/12
 * @Description
 */
public class BoxFactory {
    private HashMap<String,AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<String,AbstractBox>();
        map.put("I",new IBox());
        map.put("L",new LBox());
        map.put("O",new OBox());
    }

    private static class Box{
        private static final BoxFactory BOX_FACTORY = new BoxFactory();
    }

    public static BoxFactory getInstance(){
        return Box.BOX_FACTORY;
    }

    public AbstractBox getBox(String key){
         return map.get(key);
    }
}
