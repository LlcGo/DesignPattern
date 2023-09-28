package com.Design.abstractory.two;

import com.Design.abstractory.one.Department;
import com.Design.abstractory.one.User;
import com.Design.abstractory.two.IFactroy.IFactory;
import com.Design.abstractory.two.IFactroy.MySQLFactory;
import com.Design.abstractory.two.IService.DepartmentService;
import com.Design.abstractory.two.IService.MysqlDepartmentServiceImpl;
import com.Design.abstractory.two.IService.UserService;

/**
 * @Author Lc
 * @Date 2023/9/22
 * @PackageName: com.Design.abstractory.two
 * @ClassName: MainGo
 * @Description:
 */

public class MainGo {
    public static void main(String[] args) {
        //抽象工厂调用
//        IFactory iFactory = new MySQLFactory();
//        UserService userService = iFactory.createFactory();
//        User userInfo = userService.getUserInfo(1);
//
//        DepartmentService departmentService = iFactory.createDepartmentFactory();
//        Department department = departmentService.getDepartment(1);

        //简单工厂 + 抽象工厂
        DepartmentService departmentService = SqlFactory.getDepartmentService();
        departmentService.getDepartment(1);

        UserService userService = SqlFactory.getUserService();
        userService.getUserInfo(1);
    }
}
