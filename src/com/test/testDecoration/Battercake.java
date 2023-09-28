package com.test.testDecoration;

/**
 * @Author Lc
 * @Date 2023/5/13
 * @Description
 */
public class Battercake implements AbsBattercake{

    @Override
    public String getMsg(){
        return "煎饼";
    }

    @Override
    public int getPrice(){
        return 5;
    }

}
