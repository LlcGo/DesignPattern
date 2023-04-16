package com.lc.behavioralPattern.status.after;

/**
 * @Author Lc
 * @Date 2023/4/13
 * @Description 抽象状态类
 */
public abstract class LiftState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    abstract void open();
    abstract void close();
    abstract void stop();
    abstract void run();
}
