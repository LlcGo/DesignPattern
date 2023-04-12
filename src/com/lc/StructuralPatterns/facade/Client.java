package com.lc.StructuralPatterns.facade;

/**
 * @Author Lc
 * @Date 2023/4/11
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
        smartAppliancesFacade.say("打开");
    }
}
