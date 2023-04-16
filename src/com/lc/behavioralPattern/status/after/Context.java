package com.lc.behavioralPattern.status.after;

/**
 * @Author Lc
 * @Date 2023/4/13
 * @Description 环境角色类
 */
public class Context {
    public static final OpenningState OPENNIGN_STATE = new OpenningState();
    public static final ClosingSate CLOSING_STATE = new ClosingSate();
    public static final RunningState RUNNING_STATE = new RunningState();
    public static final StoppingState STOPPING_STATE = new StoppingState();
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }
    public void close(){
        this.liftState.close();
    }
    public void run(){
        this.liftState.run();
    }
    public void stop(){
        this.liftState.stop();
    }

}
