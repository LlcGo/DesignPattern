package com.Design.Iterator;

import com.Design.Iterator.impl.AggregateImpl;

/**
 * @Author Lc
 * @Date 2023/9/27
 * @PackageName: com.Design.Iterator
 * @ClassName: MainGo
 * @Description:
 */

public class MainGo {
    public static void main(String[] args) {
        AggregateImpl aggregate = new AggregateImpl();

        Iterator iterator = aggregate.createIterator();
        aggregate.add("员工1");
        aggregate.add("员工2");
        aggregate.add("员工3");
        aggregate.add("员工4");
        aggregate.add("员工5");
        aggregate.add("员工6");
        iterator.first();
        while (!iterator.isDone()){
            System.out.println(iterator.currentItem() + "hello");
            iterator.next();
        }
    }
}
