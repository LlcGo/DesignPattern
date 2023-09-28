package com.Design.abstractory.two.IFactroy;

import com.Design.abstractory.two.IService.DepartmentService;
import com.Design.abstractory.two.IService.UserService;

/**
 * @Author Lc
 * @Date 2023/9/22
 * @PackageName: com.Design.abstractory.two
 * @ClassName: IFactory
 * @Description:
 */

public interface IFactory {
    UserService createFactory();

    DepartmentService createDepartmentFactory();
}
