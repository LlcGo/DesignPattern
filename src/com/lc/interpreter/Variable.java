package com.lc.interpreter;

/**
 * @Author Lc
 * @Date 2023/4/15
 * @Description 封装变量类
 */
public class Variable  extends AbstractExpression{
    private String name; //申明存储变量名的成员变量

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


    @Override
    public int interpert(Context context) {
        //直接返回变量的值
        return context.getValue(this);
    }
}
