package com.test.testChain;

/**
 * @Author Lc
 * @Date 2023/5/14
 * @Description
 */
public class ManyFactory {

    public static AbsHandler createUserLogin(){
        UserNameReq userNameReq = new UserNameReq();
        UserPassword userPassword = new UserPassword();
        UserPhone userPhone = new UserPhone();
        userNameReq.setNextHandler(userPassword);
        userPassword.setNextHandler(userPhone);
        return userNameReq;
    }
}
