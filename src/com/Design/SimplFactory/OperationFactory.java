package com.Design.SimplFactory;

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
