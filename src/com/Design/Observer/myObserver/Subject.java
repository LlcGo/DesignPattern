package com.Design.Observer.myObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lc
 * @Date 2023/9/21
 * @PackageName: com.Design.Observer
 * @ClassName: Subject
 * @Description: 抽象出负责通知的类
 */

public abstract class Subject {

    //名字
    private String name;

    //放入被通知的集合
    private List<Observer> obServerList = new ArrayList<>();

    public Subject(String name) {
        this.name = name;
    }

    //添加被通知对象
    public void addObserver(Observer obServer){
        obServerList.add(obServer);
    }

    //删除被通知的对象
    public void deleteObserver(Observer obServer){
        obServerList.remove(obServer);
    }

    //调用observer里面的接收消息的方法
    public void notifyObserver(){
        obServerList.forEach(Observer::service);
    }

    public String getName() {
        return name;
    }
}
