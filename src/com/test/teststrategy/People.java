package com.test.teststrategy;

/**
 * @Author Lc
 * @Date 2023/5/7
 * @Description 抽象策略类
 */
public abstract class People {
    private String name;
    private String traffic;

    public People(String name, String traffic) {
        this.name = name;
        this.traffic = traffic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    abstract void zc();
}
