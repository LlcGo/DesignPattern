package com.lc.behavioralPattern.mediator;

/**
 * @Author Lc
 * @Date 2023/4/14
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        MediatorStructure mediatorStructure = new MediatorStructure();

        //创建租房者对象
        Tenant t = new Tenant("李四", mediatorStructure);
        //创建创建对接
        HouseOwner houseOwner = new HouseOwner("张三", mediatorStructure);

        //确定角色
        mediatorStructure.setTenant(t);
        mediatorStructure.setHouseOwner(houseOwner);

        t.constack("我要租三室的房子");
        houseOwner.constack("我这里有三室的房子，你要租吗？");
    }
}
