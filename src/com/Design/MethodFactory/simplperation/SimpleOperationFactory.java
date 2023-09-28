package com.Design.MethodFactory.simplperation;

import com.Design.MethodFactory.MethodAbract.IFactory;
import com.Design.MethodFactory.Operation;

/**
 * @Author Lc
 * @Date 2023/9/15
 * @PackageName: com.Design.MethodFactory
 * @ClassName: OperationFactory
 * @Description:
 */

public class SimpleOperationFactory implements IFactory{

    @Override
    public Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new Add();
                break;
            case "-":
                operation = new Sub();
                break;
        }
        return operation;
    }
}
