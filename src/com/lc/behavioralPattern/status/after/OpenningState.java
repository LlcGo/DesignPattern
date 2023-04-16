package com.lc.behavioralPattern.status.after;

/**
 * @Author Lc
 * @Date 2023/4/13
 * @Description
 */
public class OpenningState extends LiftState{
    @Override
    void open() {
        System.out.println("电梯开启");
    }

    @Override
    void close() {
        //修改状态
       super.context.setLiftState(Context.CLOSING_STATE);
       //调用当前状态中的context中中的close方法
       super.context.close();
    }

    @Override
    void stop() {

    }

    @Override
    void run() {

    }
}
