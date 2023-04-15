package com.lc.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Lc
 * @Date 2023/4/15
 * @Description 环境角色类
 */
public class Context {
    //存储变量和对应的值
    Map<Variable,Integer> map = new HashMap<>();

    public void assign(Variable variable,Integer value){
        map.put(variable,value);
    }

    public int getValue(Variable variable){
       return map.get(variable);
    }
}
