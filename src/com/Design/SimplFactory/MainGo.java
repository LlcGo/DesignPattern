package com.Design.SimplFactory;

/**
 * @Author Lc
 * @Date 2023/9/15
 * @PackageName: com.Design.MethodFactory
 * @ClassName: MainGo
 * @Description:
 */

public class MainGo {
    public static void main(String[] args) {
        Operation operate = OperationFactory.createOperate("+");
        operate.getResult();
    }
}
