package com.lc.adapter.demo2;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description 想要使用的读卡器
 */
public class TFCardlmpl implements TFCard {
    @Override
    public String readTF() {
        return "TF卡正在读取";
    }

    @Override
    public void writeTF() {
        System.out.println("TF卡正在写出");
    }
}
