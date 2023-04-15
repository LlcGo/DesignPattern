package com.lc.memento.black_box;


/**
 * @Author Lc
 * @Date 2023/4/15
 * @Description
 */
public class RoleStateCaretaker {
    Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
