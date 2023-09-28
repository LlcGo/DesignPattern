package com.Design.Skinmode.NoUse;

/**
 * @Author Lc
 * @Date 2023/9/18
 * @PackageName: com.Design.Skinmode
 * @ClassName: Client
 * @Description:
 */

public class Client {
    public static void main(String[] args) {
        Sock1 sock1 = new Sock1();
        Sock2 sock2 = new Sock2();

        //股票1
        sock1.buy();
        sock1.sell();

        //股票2
        sock2.buy();
        sock2.sell();
    }
}
