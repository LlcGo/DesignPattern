package com.lc.StructuralPatterns.adapter.demo1;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description 适配器类
 */
public class SDAdapterTF extends TFCardlmpl implements SDCard {

    @Override
    public String readSD() {
        return readTF();
    }

    @Override
    public void writeSD() {
       writeTF();
    }
}
