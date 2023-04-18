package com.lc.framework.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @Author Lc
 * @Date 2023/4/18
 * @Description 应为property里面可能有多个所以用这个类来管理
 */
public class MutablePropertyValues implements Iterable<PropertyValue>{
    //定义集合对象
    //final只能被赋值一次
    private final List<PropertyValue> propertyValueList;

    public MutablePropertyValues() {
        this.propertyValueList = new ArrayList<PropertyValue>();
    }

    public MutablePropertyValues(List<PropertyValue> propertyValueList) {
        if(propertyValueList == null){
            this.propertyValueList = new ArrayList<PropertyValue>();
        }else {
            this.propertyValueList = propertyValueList;
        }

    }
    //获取所有的pro对象，返回数组
    public PropertyValue[] getPropertyValues(){
        return propertyValueList.toArray(new PropertyValue[0]);
    }

    //根据name属性值获取propertyvalue
    public PropertyValue getPropertyValue(String properyName){
        for (PropertyValue propertyValue : propertyValueList) {
            if(propertyValue.getName().equals(properyName)){
                return propertyValue;
            }
        }
        return null;
    }

    //判断集合是否为null
    public boolean isEmpty(){
        return propertyValueList.isEmpty();
    }

    //添加propertyvalue对象
    public MutablePropertyValues addPropertyValue(PropertyValue pv){
        //判断存储中的是否和传进来的重复了，如果重复那就覆盖
        for (int i = 0; i < propertyValueList.size(); i++) {
            PropertyValue propertyValue = propertyValueList.get(i);
            if(propertyValue.getName().equals(pv.getName())){
                propertyValueList.set(i,pv);
                return this;//目的实现链式编程
            }
        }
        this.propertyValueList.add(pv);
        return this;//目的实现链式编程
    }

    //判断是否有指定name属性值的对象
    public boolean contains(String property){
        return getPropertyValue(property) != null;
    }

    //获取迭代对象
    @Override
    public Iterator<PropertyValue> iterator() {
        return propertyValueList.iterator();
    }

}
