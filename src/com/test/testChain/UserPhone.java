package com.test.testChain;

/**
 * @Author Lc
 * @Date 2023/5/14
 * @Description
 */
public class UserPhone extends AbsHandler {
    @Override
    protected void isOK(User user) {
        if(user.getPhone() != null){
            System.out.println("手机输入正确");
            if(nextHandler != null){
                this.nextHandler.isOK(user);
            }
        }else {
            System.out.println("请输入手机号码");
        }
    }
}
