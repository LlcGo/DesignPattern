package com.lc.sigletion.type5;

/**
 * @Author Lc
 * @Date 2023/4/7
 * @Description
 */
public class SigletonTest05 {
}

class Singleton{
    private static volatile Singleton singleton;
    private Singleton(){}

    //提供静态方法，加入双重检查，解决线程安全问题，同时解决懒加载问题

    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}