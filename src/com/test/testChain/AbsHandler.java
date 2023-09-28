package com.test.testChain;

/**
 * @Author Lc
 * @Date 2023/5/14
 * @Description
 */
public abstract class AbsHandler {
    protected AbsHandler nextHandler;

    public void setNextHandler(AbsHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 子类实现验证是否继续向下判断
     * @param user
     * @return
     */
    protected abstract void isOK(User user);
}
