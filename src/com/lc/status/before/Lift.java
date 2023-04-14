package com.lc.status.before;

/**
 * @Author Lc
 * @Date 2023/4/13
 * @Description
 */
public class Lift implements ILift {
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
//        switch。。。。
        System.out.println("电梯门打开");
    }

    @Override
    public void close() {
//        switch。。。。
        System.out.println("电梯门关闭");
    }

    @Override
    public void stop() {
//        switch。。。。
        System.out.println("电梯停止运行");
    }

    @Override
    public void run() {
//        switch。。。。
        System.out.println("电梯运行中");
    }
}
