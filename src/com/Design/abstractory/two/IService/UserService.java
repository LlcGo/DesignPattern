package com.Design.abstractory.two.IService;

import com.Design.abstractory.one.User;

/**
 * @Author Lc
 * @Date 2023/9/22
 * @PackageName: com.Design.abstractory.two
 * @ClassName: UserService
 * @Description:
 */

public interface UserService {

    void insert(User user);

    User getUserInfo(int id);
}
