package com.lc.StructuralPatterns.adapter.demo1;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description 计算机能使用的读卡器
 */
public class SDcardImpl implements SDCard {
    @Override
    public String readSD() {
        return "SD卡正在读取";
    }

    @Override
    public void writeSD() {
        System.out.println("TF卡正在写出");
    }
}
