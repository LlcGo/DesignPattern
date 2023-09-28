package com.Design.Observer.javaImpl;

import com.Design.Observer.javaImpl.ObserverImpl.StockObserver;
import com.Design.Observer.javaImpl.SubjectImpl.Secretary;

/**
 * @Author Lc
 * @Date 2023/9/21
 * @PackageName: com.Design.Observer.javaImpl
 * @ClassName: MainGo
 * @Description:
 */

public class MainGo {
    public static void main(String[] args) {
        StockObserver xw = new StockObserver("小王");
        Secretary secretary = new Secretary("秘书：小丽");
        secretary.addObserver(xw);
        secretary.setAction("go");
    }
}
