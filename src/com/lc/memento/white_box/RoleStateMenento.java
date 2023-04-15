package com.lc.memento.white_box;

/**
 * @Author Lc
 * @Date 2023/4/15
 * @Description 备忘录角色类
 */
public  class RoleStateMenento {
    protected int vit;
    protected int atk;
    protected int def;

    public RoleStateMenento() {
    }

    public RoleStateMenento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
