package com.test.testProxy;

/**
 * @Author Lc
 * @Date 2023/5/12
 * @Description
 */
public class Dl implements Proxy{
    private Dx dx;

    public Dl(Dx dx) {
        this.dx = dx;
    }

    @Override
    public void Action() {
        System.out.println("a");
         dx.Action();
        System.out.println("c");
    }
}
