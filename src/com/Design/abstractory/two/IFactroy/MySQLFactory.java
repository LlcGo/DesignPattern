package com.Design.abstractory.two.IFactroy;

import com.Design.abstractory.two.IService.DepartmentService;
import com.Design.abstractory.two.IService.MysqlDepartmentServiceImpl;
import com.Design.abstractory.two.IService.MysqlUserServiceImpl;
import com.Design.abstractory.two.IService.UserService;

/**
 * @Author Lc
 * @Date 2023/9/22
 * @PackageName: com.Design.abstractory.two
 * @ClassName: MySQLFactory
 * @Description:
 */

public class MySQLFactory implements IFactory {
    @Override
    public UserService createFactory() {
        return new MysqlUserServiceImpl();
    }

    @Override
    public DepartmentService createDepartmentFactory() {
        return new MysqlDepartmentServiceImpl();
    }
}
