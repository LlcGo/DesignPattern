package com.Design.abstractory.two.IService;

import com.Design.abstractory.one.User;

/**
 * @Author Lc
 * @Date 2023/9/22
 * @PackageName: com.Design.abstractory.two
 * @ClassName: MysqlServiceImpl
 * @Description:
 */

public class MysqlUserServiceImpl implements UserService {

    @Override
    public void insert(User user) {
        System.out.println("Mysql对用户表的插入");
    }

    @Override
    public User getUserInfo(int id) {
        System.out.println("mysql对用户表的查询");
        return null;
    }
}
