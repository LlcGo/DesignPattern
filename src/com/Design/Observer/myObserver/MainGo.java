package com.Design.Observer.myObserver;

import com.Design.Observer.myObserver.ObserverImpl.NBAObserver;
import com.Design.Observer.myObserver.SubjectImpl.Secretary;

/**
 * @Author Lc
 * @Date 2023/9/21
 * @PackageName: com.Design.Observer
 * @ClassName: MainGo
 * @Description:
 */

public class MainGo {
    public static void main(String[] args) {

        Secretary secretary = new Secretary("秘书：小丽");
        NBAObserver xw = new NBAObserver("小王", secretary);
        secretary.addObserver(xw);
        secretary.notifyObserver();

    }
}
