package com.Design.Adapter;

/**
 * @Author Lc
 * @Date 2023/9/25
 * @PackageName: com.Design.Adapter
 * @ClassName: Adpter
 * @Description:
 */

public class Adapter extends FSay{

    private Interpreter interpreter;

    public Adapter(){
       this.interpreter = new Interpreter();
    }


    @Override
    public void say() {
        interpreter.Say();
    }
}
