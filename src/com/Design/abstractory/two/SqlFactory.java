package com.Design.abstractory.two;

import com.Design.abstractory.two.IService.DepartmentService;
import com.Design.abstractory.two.IService.UserService;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author Lc
 * @Date 2023/9/22
 * @PackageName: com.Design.abstractory.two
 * @ClassName: SqlFactory
 * @Description:
 */

public class SqlFactory {

    //选择实体化的对象
    private static String classLoader = "com.Design.abstractory.two.IService.";

    //选择数据库
    private static String  db = "Mysql";

    public  static UserService getUserService(){
//        UserService userService = null;
//        switch (operate){
//            case "mysql" :
//                userService = new MysqlUserServiceImpl();
//                break;
//            case "sqlServer" :
//                userService = new SqlServerUserServiceImpl();
//                break;
//        }
        String classFrom = classLoader + db + "UserServiceImpl";
        return (UserService) getInstance(classFrom);
    }

    public  static DepartmentService getDepartmentService(){

//        DepartmentService departmentService = null;
//        switch (operate){
//            case "mysql" :
//                departmentService = new MysqlDepartmentServiceImpl();
//                break;
//            case "sqlServer" :
//                departmentService = new SqlServerDepartmentServiceImpl();
//                break;
//        }
//        try {
//            departmentService = (DepartmentService) Class.forName(classLoader + db +"DepartmentServiceImpl").getDeclaredConstructor().newInstance();
//        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        String classFrom = classLoader + db + "DepartmentServiceImpl";
        return (DepartmentService) getInstance(classFrom);
    }

    private static Object getInstance(String classLoader){
        try {
            return Class.forName(classLoader).getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
