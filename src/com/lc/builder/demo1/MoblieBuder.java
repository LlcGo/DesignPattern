package com.lc.builder.demo1;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description 具体的构建者 创建摩拜
 */
public class MoblieBuder extends Builder{
    @Override
    public void buildFrame() {
        bilke.setFarm("碳钎维车架");
    }

    @Override
    public void buildSeat() {
        bilke.setSeat("真皮车座");
    }

    @Override
    public Bilke createBike() {
        return bilke;
    }
}
