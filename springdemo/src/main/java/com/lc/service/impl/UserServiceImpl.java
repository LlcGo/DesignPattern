package com.lc.service.impl;

import com.lc.dao.UserDao;
import com.lc.service.UserService;

/**
 * @Author Lc
 * @Date 2023/4/16
 * @Description
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl() {
        System.out.println("userService被创建了");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("userService...");
        userDao.add();
    }
}
