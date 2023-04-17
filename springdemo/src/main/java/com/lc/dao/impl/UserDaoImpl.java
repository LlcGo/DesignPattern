package com.lc.dao.impl;

import com.lc.dao.UserDao;

/**
 * @Author Lc
 * @Date 2023/4/16
 * @Description
 */
public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("UserDao被创建了");
    }

    @Override
    public void add() {
        System.out.println("userDao...");
    }
}
