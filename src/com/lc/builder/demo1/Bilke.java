package com.lc.builder.demo1;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description
 */
public class Bilke {
    private String farm;//车架
    private String seat;//车座

    public String getFarm() {
        return farm;
    }

    public void setFarm(String farm) {
        this.farm = farm;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Bilke{" +
                "farm='" + farm + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
