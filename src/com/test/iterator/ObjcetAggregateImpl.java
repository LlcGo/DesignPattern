package com.test.iterator;

import java.util.ArrayList;

/**
 * @Author Lc
 * @Date 2023/5/10
 * @Description
 */
public class ObjcetAggregateImpl implements ObjetcAggregate {

    ArrayList list;

    public ObjcetAggregateImpl() {
        this.list = new ArrayList();
    }

    @Override
    public void add(Object o) {
        list.add(o);
    }

    @Override
    public void remove(Object o) {
        list.remove(o);
    }

    @Override
    public Object getIterator() {
        return new IteratiorImp(this.list);
    }
}
