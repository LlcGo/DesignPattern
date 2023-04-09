package com.lc.sigletion.type7;

/**
 * @Author Lc
 * @Date 2023/4/7
 * @Description
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instange = Singleton.INSTANGE;
        Singleton instange2 = Singleton.INSTANGE;
        System.out.println(instange == instange2);
    }
}

enum Singleton{
    INSTANGE;
    public void method(){

    }
}
