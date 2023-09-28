package com.test.testChain;

/**
 * @Author Lc
 * @Date 2023/5/14
 * @Description
 */
public class CreateFactory implements HandlerFactory {
    private AbsHandler absHandler;
    @Override
    public  AbsHandler createChain() {
        UserNameReq userNameReq = new UserNameReq();
        UserPassword userPassword = new UserPassword();
        UserPhone userPhone = new UserPhone();
        userNameReq.setNextHandler(userPassword);
        userPassword.setNextHandler(userPhone);
        absHandler = userNameReq;
        return absHandler;
    }
}
