package com.test.testTemplate;

/**
 * @Author Lc
 * @Date 2023/5/11
 * @Description
 */
public abstract class AbrastTamplate {


    public void make(){
        this.one();
        this.two();
        if(isTrue()){
            this.three();
        }
        this.four();
    }

    private final void one(){
        System.out.println("a事件");
    }

    private final void two(){
        System.out.println("b事件");
    }

    private final void three(){
        System.out.println("c事件");
    }

    //钩子方法
    protected boolean isTrue(){
        return true;
    }

    abstract void four();
}
