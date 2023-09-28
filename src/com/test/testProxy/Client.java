package com.test.testProxy;

/**
 * @Author Lc
 * @Date 2023/5/12
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Dx dx = new Dx();
        dx.Action();
        Dl dl = new Dl(new Dx());
        dl.Action();
//        动态代理
//        DTDL dtdl = new DTDL();
//        Proxy dx = (Proxy)dtdl.newProxyInstance(new Dx());
//        dx.Action();
    }
}
