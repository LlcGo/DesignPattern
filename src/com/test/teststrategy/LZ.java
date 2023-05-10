package com.test.teststrategy;

/**
 * @Author Lc
 * @Date 2023/5/7
 * @Description
 */
public class LZ extends People{


    public LZ(String name, String traffic) {
        super(name, traffic);
    }

    @Override
    public void zc() {
        System.out.println(this.getName() + "选择" + this.getTraffic());
    }
}
