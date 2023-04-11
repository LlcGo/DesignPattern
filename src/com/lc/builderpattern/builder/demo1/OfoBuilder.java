package com.lc.builderpattern.builder.demo1;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description 具体的构建者 创建ofo
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bilke.setFarm("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bilke.setSeat("橡胶车座");
    }

    @Override
    public Bilke createBike() {
        return bilke;
    }
}
