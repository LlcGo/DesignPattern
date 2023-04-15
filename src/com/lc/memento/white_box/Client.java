package com.lc.memento.white_box;

/**
 * @Author Lc
 * @Date 2023/4/15
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=======================大战boss前=========================");
        GanmeRole ganmeRole = new GanmeRole();
        ganmeRole.initState();
        //存档
        //创建管理者对象
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMenento(ganmeRole.saveState());
        ganmeRole.stateDisplay();
        System.out.println("=======================大战boss后=========================");
        ganmeRole.fight();
        ganmeRole.stateDisplay();

        System.out.println("=======================恢复状态之前=========================");
        ganmeRole.recoverState(roleStateCaretaker.getRoleStateMenento());
        ganmeRole.stateDisplay();
    }
}
