package com.lc.memento.black_box;


/**
 * @Author Lc
 * @Date 2023/4/15
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=======================大战boss前=========================");
        GameRole gameRole  = new GameRole();
        gameRole.initState();
        //存档
        //创建管理者对象
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(gameRole.saveState());
        gameRole.stateDisplay();
        System.out.println("=======================大战boss后=========================");
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("=======================恢复状态之前=========================");
        gameRole.recoverState(roleStateCaretaker.getMemento());
        gameRole.stateDisplay();
    }
}
