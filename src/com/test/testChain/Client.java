package com.test.testChain;

/**
 * @Author Lc
 * @Date 2023/5/14
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        User user = new User();
        user.setUserName("lw");
        user.setPassword("123456");
        user.setPhone("213213546515153");
        HandlerFactory handlerFactory = new CreateFactory();
        AbsHandler chain = handlerFactory.createChain();
        chain.isOK(user);
        AbsHandler userLogin = ManyFactory.createUserLogin();
        userLogin.isOK(user);
    }
}
