package com.test.testTemplate;

/**
 * @Author Lc
 * @Date 2023/5/11
 * @Description
 */
public class Five extends AbrastTamplate{

    public Five() {
    }

    private boolean isOK = false;

    public Five(boolean b) {
         this.isOK = b;
    }

    @Override
    protected boolean isTrue() {
        return isOK;
    }

    @Override
    void four() {
        System.out.println("false four true five");
    }
}
