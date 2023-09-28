package com.Design.abstractory.one;

/**
 * @Author Lc
 * @Date 2023/9/22
 * @PackageName: com.Design.abstractory
 * @ClassName: SqlServerUser
 * @Description:
 */

public class SqlServerUser {

    public void insert(User user){
        System.out.println("添加一个用户");
    }

    public User getUserInfo(int id){
        System.out.println("查询到一个用户");
        return null;
    }
}
