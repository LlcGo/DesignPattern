package com.Design.MethodFactory.MethodAbract;

import com.Design.MethodFactory.Operation;

/**
 * @Author Lc
 * @Date 2023/9/15
 * @PackageName: com.Design.MethodFactory
 * @ClassName: IFactory
 * @Description:
 */

public interface IFactory {
    Operation createOperation(String op);
}
