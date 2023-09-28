package com.test.testTemplate;

/**
 * @Author Lc
 * @Date 2023/5/11
 * @Description
 */
public class Four extends AbrastTamplate {

    @Override
    protected boolean isTrue() {
        return true;
    }

    @Override
    void four() {
        System.out.println("true four");
    }
}
