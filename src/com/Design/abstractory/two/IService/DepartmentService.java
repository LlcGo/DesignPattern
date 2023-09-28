package com.Design.abstractory.two.IService;

import com.Design.abstractory.one.Department;

/**
 * @Author Lc
 * @Date 2023/9/22
 * @PackageName: com.Design.abstractory.two.IService
 * @ClassName: DempartmentService
 * @Description:
 */

public interface DepartmentService {

    void insert(Department department);

    Department getDepartment(Integer id);
}
