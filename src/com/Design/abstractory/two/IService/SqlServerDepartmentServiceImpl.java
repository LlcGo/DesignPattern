package com.Design.abstractory.two.IService;

import com.Design.abstractory.one.Department;
import com.Design.abstractory.one.User;

/**
 * @Author Lc
 * @Date 2023/9/22
 * @PackageName: com.Design.abstractory.two
 * @ClassName: SqlServcerServiceImpl
 * @Description:
 */

public class SqlServerDepartmentServiceImpl implements DepartmentService {

    @Override
    public void insert(Department department) {
        System.out.println("sqlServer对部门表添加一个部门");
    }

    @Override
    public Department getDepartment(Integer id) {
        System.out.println("sqlServer在部门表查询到一个部门");
        return null;
    }
}
