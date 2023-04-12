package com.lc.StructuralPatterns.proxy.static_proxy;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        //创建代售点对象
        ProxyPoint proxyPoint = new ProxyPoint();;
        proxyPoint.sell();
    }
}
