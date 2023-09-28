package com.Design.abstractory.two.IService;

import com.Design.abstractory.one.Department;
import com.Design.abstractory.one.User;

/**
 * @Author Lc
 * @Date 2023/9/22
 * @PackageName: com.Design.abstractory.two
 * @ClassName: MysqlServiceImpl
 * @Description:
 */

public class MysqlDepartmentServiceImpl implements DepartmentService {



    @Override
    public void insert(Department department) {
        System.out.println("Mysql对部门表的插入");
    }

    @Override
    public Department getDepartment(Integer id) {
        System.out.println("mysql对部门表的查询");
        return null;
    }
}
