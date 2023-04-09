package com.lc.sigletion.type6;

/**
 * @Author Lc
 * @Date 2023/4/7
 * @Description
 */
public class SigletonTest06 {
}

class Singleton{
    private Singleton(){}

    private static class singletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return singletonInstance.INSTANCE;
    }
}
