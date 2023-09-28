package com.Design.MethodFactory.properation;

import com.Design.MethodFactory.MethodAbract.*;
import com.Design.MethodFactory.Operation;
import com.Design.MethodFactory.simplperation.Add;

/**
 * @Author Lc
 * @Date 2023/9/15
 * @PackageName: com.Design.MethodFactory
 * @ClassName: OperationFactory
 * @Description:
 */

public class ProOperationFactory implements IFactory{

    @Override
    public Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate){
            case "pow":
                operation = new Pow();
                break;
            case "log":
                operation = new Log();
                break;
        }
        return operation;
    }
}
