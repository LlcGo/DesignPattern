package com.test.iterator;

import jdk.nashorn.internal.ir.CallNode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author Lc
 * @Date 2023/5/10
 * @Description
 */
public class IteratiorImp implements  Iterator {

    private ArrayList list;
    private Integer ishave = 0;

    public IteratiorImp(ArrayList list) {
        this.list = list;
    }

    @Override
    public  Object hasNext() {
        Object o = list.get(ishave);
        ishave++;
        return o;
    }

    @Override
    public boolean isNext() {
        return ishave < list.size();
    }
}
