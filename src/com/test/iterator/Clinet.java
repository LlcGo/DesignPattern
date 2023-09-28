package com.test.iterator;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @Author Lc
 * @Date 2023/5/10
 * @Description
 */
public class Clinet {
    public static void main(String[] args) {
        Student lw = new Student.Build().Age(16).Name("老王").build();
        Student ll = new Student.Build().Age(16).Name("老李").build();
        ObjcetAggregateImpl objcetAggregate = new ObjcetAggregateImpl();
        objcetAggregate.add(lw);
        objcetAggregate.add(ll);
        IteratiorImp iterator = (IteratiorImp)objcetAggregate.getIterator();
        while (iterator.isNext()){
            Object o = iterator.hasNext();
            System.out.println(o);
        }
    }
}
