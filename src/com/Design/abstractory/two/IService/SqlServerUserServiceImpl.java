package com.Design.abstractory.two.IService;

import com.Design.abstractory.one.User;

/**
 * @Author Lc
 * @Date 2023/9/22
 * @PackageName: com.Design.abstractory.two
 * @ClassName: SqlServcerServiceImpl
 * @Description:
 */

public class SqlServerUserServiceImpl implements UserService {

    public void insert(User user){
        System.out.println("sqlServer对用户表添加一个用户");
    }

    public User getUserInfo(int id){
        System.out.println("sqlServer再用户表查询到一个用户");
        return null;
    }
}
