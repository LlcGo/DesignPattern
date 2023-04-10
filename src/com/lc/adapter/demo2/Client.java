package com.lc.adapter.demo2;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String s1 = computer.readSD(new SDcardImpl());
        System.out.println(s1);
        System.out.println("====================");
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardlmpl());
        String s = computer.readSD(sdAdapterTF);
        System.out.println(s);
    }
}
