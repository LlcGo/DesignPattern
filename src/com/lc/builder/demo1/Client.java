package com.lc.builder.demo1;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        MoblieBuder moblieBuder = new MoblieBuder();
        //创建指挥着对象
        Director director = new Director(moblieBuder);
        //让指挥着进行自行车的组装
        Bilke construct = director.construct();
        System.out.println(construct);
    }
}
