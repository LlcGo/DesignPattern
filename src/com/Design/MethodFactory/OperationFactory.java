package com.Design.MethodFactory;

import com.Design.MethodFactory.MethodAbract.IFactory;
import com.Design.MethodFactory.properation.ProOperationFactory;
import com.Design.MethodFactory.simplperation.SimpleOperationFactory;

/**
 * @Author Lc
 * @Date 2023/9/15
 * @PackageName: com.Design.MethodFactory
 * @ClassName: OperationFactory
 * @Description:
 */

public class OperationFactory {
    public static Operation createOperate(String operate){
        Operation operation = null;
        IFactory factory = null;
        switch (operate){
            case "+":
            case "-":
                factory = new SimpleOperationFactory();
                break;
            case "log":
            case "pow":
                factory = new ProOperationFactory();
        }
        operation = factory.createOperation(operate);
        return operation;
    }
}
