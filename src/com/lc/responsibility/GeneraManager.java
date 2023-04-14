package com.lc.responsibility;

/**
 * @Author Lc
 * @Date 2023/4/13
 * @Description
 */
public class GeneraManager extends Handler {
    public GeneraManager() {
        super(Handler.NUM_ONE,Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest request) {
        System.out.println(request.getName() + "请假"
                + request.getNum() + "天" + request.getContent());
        System.out.println("部门领导审批同意");
    }
}
