package com.Design.Iterator.impl;

import com.Design.Iterator.Aggregate;
import com.Design.Iterator.Iterator;

/**
 * @Author Lc
 * @Date 2023/9/27
 * @PackageName: com.Design.Iterator.impl
 * @ClassName: IteratorImpl
 * @Description:
 */

public class IteratorImpl implements Iterator {

    private AggregateImpl aggregate;
    private int current = 0;


    public IteratorImpl(AggregateImpl aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.getCurrentItem(0);
    }

    @Override
    public Object next() {
        Object ret = null;
        current++;
        if(current < aggregate.getCount()){
            ret = aggregate.getCurrentItem(current);
        }
        return ret;
    }

    @Override
    public Boolean isDone() {
        return current >= aggregate.getCount();
    }

    @Override
    public Object currentItem() {
        return aggregate.getCurrentItem(current);
    }
}
