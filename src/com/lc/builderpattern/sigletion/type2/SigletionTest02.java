package com.lc.builderpattern.sigletion.type2;

/**
 * @Author Lc
 * @Date 2023/4/7
 * @Description
 */
public class SigletionTest02 {
}
//饿汉式(静态变量)
class Singleton{

    //1.构造器私有化
    private Singleton() {

    }
    //3.内部创建对象实例
    private static Singleton instance;

    static {//4.再静态代码块中创建单例对象
        instance = new Singleton();
    }

    //5.开放一个公共类可以获取类型
    public static Singleton getInstance(){
        return instance;
    }
}