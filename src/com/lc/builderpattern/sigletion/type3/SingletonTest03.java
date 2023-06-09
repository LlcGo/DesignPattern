package com.lc.builderpattern.sigletion.type3;

/**
 * @Author Lc
 * @Date 2023/4/7
 * @Description
 */
public class SingletonTest03 {
}

class Signleton{
    private static Signleton instance;

    private Signleton(){}

    //提供一个静态的共有方法,当用到该方法的时候，才去创建instance
    //懒汉式
    public static Signleton getInstance(){
        if (instance == null){
            instance = new Signleton();
        }
        return instance;
    }

}
