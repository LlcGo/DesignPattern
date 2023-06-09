package com.lc.principle.liskov;

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
        System.out.println("11-3=" + b.func1(11,3));//本意11-3
        System.out.println("1-8=" + b.func1(1,8));//本意1-8
        System.out.println("11+3+9=" + b.func1(11,3));
    }
}

class A{
    //返回俩个数的差
    public int func1(int num1,int num2){
        return num1 - num2;
    }
}

//增加了一个新的功能完成俩个数增加,然后和9求和
class B extends A{
    //这里重写了 a 的方法 无意的时候重写了
    public int func1(int a, int b){
        return a + b;
    }
    public int func2(int a,int b){
        return func1(a,b) + 9;
    }
}
