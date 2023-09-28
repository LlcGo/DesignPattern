package com.Design.Skinmode.USE;

/**
 * @Author Lc
 * @Date 2023/9/18
 * @PackageName: com.Design.Skinmode.USE
 * @ClassName: JIJin
 * @Description:
 */

public class JIJin {

    private Sock1 sock1;
    private Sock2 sock2;

    public JIJin(){
        sock1 = new Sock1();
        sock2 = new Sock2();
    }

    public void buy(){
        sock1.buy();
        sock2.buy();
    }

    public void sell(){
        sock1.sell();
        sock2.sell();
    }
}
