package com.lc.mediator;

/**
 * @Author Lc
 * @Date 2023/4/14
 * @Description 具体同事类
 */
public class Tenant extends Person {

    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constack(String message){
          mediator.constack(message,this);
    }

    public void getMessage(String message){
        System.out.println("租房者" + name + "获取到的信息是" + message);
    }

}
