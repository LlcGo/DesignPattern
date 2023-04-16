package com.lc.behavioralPattern.responsibility;

/**
 * @Author Lc
 * @Date 2023/4/13
 * @Description 抽象处理者类
 */
public abstract class Handler {
    protected static final int NUM_ONE = 1;
    protected static final int NUM_THREE = 3;
    protected static final int NUM_SEVEN = 7;

    private int numStart;
    private int numEnd;

    protected Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final void submit(LeaveRequest request){
        this.handleLeave(request);
       if(this.nextHandler != null && request.getNum() > this.numEnd){
           //提交给权限更高的
           this.nextHandler.submit(request);
       }else {
           System.out.println("流程结束");
       }
    }

    protected abstract void handleLeave(LeaveRequest request);
}
