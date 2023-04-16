package com.lc.behavioralPattern.memento.white_box;

/**
 * @Author Lc
 * @Date 2023/4/15
 * @Description 备忘录对象管理对象
 */
public class RoleStateCaretaker {
    private RoleStateMenento roleStateMenento;

    public RoleStateMenento getRoleStateMenento() {
        return roleStateMenento;
    }

    public void setRoleStateMenento(RoleStateMenento roleStateMenento) {
        this.roleStateMenento = roleStateMenento;
    }
}
