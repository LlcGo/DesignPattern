package com.lc.principle.liskov.improve;

import java.util.ArrayList;

/**
 * @Author Lc
 * @Date 2023/4/6
 * @Description
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11,3));
        System.out.println("1-8=" + a.func1(1,8));

        System.out.println("-----------------------");
        B b = new B();
        //因为B类不在继承A类,因此调用者,不会再func1是求减法
        //调用完成的功能就会很明确
        System.out.println("11+3=" + b.func1(11,3));//本意11+3
        System.out.println("1+8=" + b.func1(1,8));//本意1+8
        System.out.println("11+3+9=" + b.func1(11,3));

        //使用组合仍然可以使用A的方法
        System.out.println("11-3=" + b.func3(11,3));
    }
}

//创建一个更加基础的基类
class Base{

}

class A extends Base{
    //返回俩个数的差
    public int func1(int num1,int num2){
        return num1 - num2;
    }
}

//增加了一个新的功能完成俩个数增加,然后和9求和
class B extends Base {
    //如果B里面还要使用A的方法,使用组合
    private A a = new A();

    //这里重写了 a 的方法 无意的时候重写了
    public int func1(int a, int b){
        return a + b;
    }
    public int func2(int a,int b){
        return func1(a,b) + 9;
    }

    //如果你还想在B里面使用A的方法
    public int func3(int a, int b){
        return this.a.func1(a,b);
    }
}
