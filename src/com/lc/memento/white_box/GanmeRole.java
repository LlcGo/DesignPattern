package com.lc.memento.white_box;

/**
 * @Author Lc
 * @Date 2023/4/15
 * @Description
 */
public class GanmeRole  {
    private int vit;
    private int atk;
    private int def;
    void initState(){
       this.vit = 100;
       this.atk = 100;
       this.def = 100;
    }
    void fight(){
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    RoleStateMenento saveState(){
        return new RoleStateMenento(vit,atk,def);
    }
    public void recoverState(RoleStateMenento roleStateMenento){
        this.vit = roleStateMenento.getVit();
        this.atk = roleStateMenento.getAtk();
        this.def = roleStateMenento.getDef();
    }

    public void stateDisplay(){
        System.out.println("角色生命力" + vit);
        System.out.println("角色生防御力" + def);
        System.out.println("角色攻击力" + atk);
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
