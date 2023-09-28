package com.test.testChain;

/**
 * @Author Lc
 * @Date 2023/5/14
 * @Description
 */
public class UserPassword extends AbsHandler {
    @Override
    protected void isOK(User user) {
        if(user.getPassword() != null){
            System.out.println("密码输入成功");
            if(nextHandler != null){
                this.nextHandler.isOK(user);
            }
        }else {
            System.out.println("请输入密码");
        }
    }
}
