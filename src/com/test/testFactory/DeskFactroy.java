package com.test.testFactory;

/**
 * @Author Lc
 * @Date 2023/5/8
 * @Description
 */
public class DeskFactroy {

    public static Desk create(Type type){
        if(type.equals(Type.PlasticDesk)){
            return new PlasticDesk();
        }else {
            return new WoodenDesk();
        }
    }
}
