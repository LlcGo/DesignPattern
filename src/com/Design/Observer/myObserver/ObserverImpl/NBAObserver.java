package com.Design.Observer.myObserver.ObserverImpl;

import com.Design.Observer.myObserver.Observer;
import com.Design.Observer.myObserver.Subject;

/**
 * @Author Lc
 * @Date 2023/9/21
 * @PackageName: com.Design.Observer.myObserver.ObserverImpl
 * @ClassName: NBAObserver
 * @Description: 上班摸鱼看NBA 的人
 */

public class NBAObserver implements Observer {

    private String name;
    private Subject subject;

    public NBAObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void service() {
        System.out.println(subject.getName() + "通知" + name + "别看NBA了");
    }
}
