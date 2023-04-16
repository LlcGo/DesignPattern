package com.lc.behavioralPattern.responsibility;

/**
 * @Author Lc
 * @Date 2023/4/13
 * @Description
 */
public class GroupLeader extends Handler{

    public GroupLeader() {
        super(0,Handler.NUM_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest request) {
        System.out.println(request.getName() + "请假"
        + request.getNum() + "天" + request.getContent());
        System.out.println("小组长审批同意");
    }


}
