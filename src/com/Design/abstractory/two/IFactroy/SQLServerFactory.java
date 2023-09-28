package com.Design.abstractory.two.IFactroy;

import com.Design.abstractory.two.IService.DepartmentService;
import com.Design.abstractory.two.IService.SqlServerDepartmentServiceImpl;
import com.Design.abstractory.two.IService.SqlServerUserServiceImpl;
import com.Design.abstractory.two.IService.UserService;

/**
 * @Author Lc
 * @Date 2023/9/22
 * @PackageName: com.Design.abstractory.two
 * @ClassName: SQLServerFactory
 * @Description:
 */

public class SQLServerFactory implements IFactory {
    @Override
    public UserService createFactory() {
        return new SqlServerUserServiceImpl();
    }

    @Override
    public DepartmentService createDepartmentFactory() {
        return new SqlServerDepartmentServiceImpl();
    }
}
