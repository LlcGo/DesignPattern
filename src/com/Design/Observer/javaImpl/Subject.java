package com.Design.Observer.javaImpl;

import java.util.Observable;

/**
 * @Author Lc
 * @Date 2023/9/21
 * @PackageName: com.Design.Observer.javaImpl
 * @ClassName: Subject
 * @Description:
 */

public abstract class Subject extends Observable {
    private String name;
    private String action;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //获得状态
    public String getAction() {
        return action;
    }

    //设置状态
    public void setAction(String action) {
        this.action = action;
        //改变被通知者的状态
        super.setChanged();
        //调用父类的Observable，通知所有的被通知者（观察者）
        super.notifyObservers();
    }
}
