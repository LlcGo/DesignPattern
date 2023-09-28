package com.test.testChain;

/**
 * @Author Lc
 * @Date 2023/5/14
 * @Description
 */
public class UserNameReq extends AbsHandler {
    @Override
    protected void isOK(User user) {
        if (user.getUserName() != null) {
            System.out.println("校验通过");
            if (nextHandler != null) {
                this.nextHandler.isOK(user);
            }
        }else {
            System.out.println("验证失败");
        }
    }
}