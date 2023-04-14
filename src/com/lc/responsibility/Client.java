package com.lc.responsibility;

/**
 * @Author Lc
 * @Date 2023/4/13
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        //请假条
        LeaveRequest leaveRequest = new LeaveRequest("小明", 5, "身体不适");

        Manager manager = new Manager();
        GroupLeader groupLeader = new GroupLeader();
        GeneraManager generaManager = new GeneraManager();

        //设置责任链
        groupLeader.setNextHandler(generaManager);
        generaManager.setNextHandler(manager);

        //提交请假条
        groupLeader.submit(leaveRequest);
    }
}
