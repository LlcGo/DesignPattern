package com.Design.Adapter;

/**
 * @Author Lc
 * @Date 2023/9/25
 * @PackageName: com.Design.Adapter
 * @ClassName: MainGo
 * @Description:
 */

public class MainGo {
    public static void main(String[] args) {
        FSay fSay = new Adapter();
        fSay.say();
    }
}
