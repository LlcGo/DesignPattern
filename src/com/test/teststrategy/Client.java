package com.test.teststrategy;

/**
 * @Author Lc
 * @Date 2023/5/7
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        final Content content = new Content(new XW("小王", "火车"));
        final Content content2 = new Content(new LZ("老张", "火车"));
        final Content content3 = new Content(new LW("老王", "火车"));
        content.choose();
        content2.choose();
        content3.choose();
    }
}
