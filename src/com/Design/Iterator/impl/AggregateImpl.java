package com.Design.Iterator.impl;

import com.Design.Iterator.Aggregate;
import com.Design.Iterator.Iterator;

import java.util.ArrayList;

/**
 * @Author Lc
 * @Date 2023/9/27
 * @PackageName: com.Design.Iterator.impl
 * @ClassName: AggregateImpl
 * @Description:
 */

public class AggregateImpl extends Aggregate {

    //放集合的地方
    private ArrayList<Object> item = new ArrayList<Object>();

    @Override
    public Iterator createIterator() {
        return new IteratorImpl(this);
    }

    //返回聚合总数
    public int getCount(){
        return item.size();
    }

    //新增对象
    public void add(Object object){
        item.add(object);
    }

    //得到指定索引的对象
    public Object getCurrentItem(int index){
        return item.get(index);
    }
}
