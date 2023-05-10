package com.lc.StructuralPatterns.adapter.demo2;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description 适配器类
 */
public class SDAdapterTF extends SDcardImpl {

    //聚合
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        return tfCard.readTF();
    }
}
