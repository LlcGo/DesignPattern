package com.lc.builderpattern.sigletion.type1;

/**
 * @Author Lc
 * @Date 2023/4/7
 * @Description
 */
public class SigletionTest01 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); //true
    }
}

//饿汉式(静态变量)
class Singleton{

    //1.构造器私有化
    private Singleton() {
    }
    //2.本类中创建对象实例
    private static final Singleton instance = new Singleton();

    //3.开放一个公共类可以获取类型
    public static Singleton getInstance(){
        return instance;
    }
}