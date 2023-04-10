package com.lc.adapter.demo1;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDAdapterTF sdAdapterTF = new SDAdapterTF();
        String s = computer.readSD(sdAdapterTF);
        System.out.println(s);
    }
}
