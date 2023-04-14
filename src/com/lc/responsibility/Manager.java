package com.lc.responsibility;

/**
 * @Author Lc
 * @Date 2023/4/13
 * @Description
 */
public class Manager extends Handler{
    public Manager() {
        super(Handler.NUM_THREE,Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest request) {
        System.out.println(request.getName() + "请假"
                + request.getNum() + "天" + request.getContent());
        System.out.println("主管审批同意");
    }
}
