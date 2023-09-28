package com.Design.Observer.javaImpl.ObserverImpl;

import com.Design.Observer.javaImpl.Subject;
import com.Design.Observer.javaImpl.SubjectImpl.Secretary;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author Lc
 * @Date 2023/9/21
 * @PackageName: com.Design.Observer.javaImpl
 * @ClassName: StockObserver
 * @Description:
 */

public class StockObserver implements Observer {

    private String name;

    public StockObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        //o 就是 负责通知的类
        Subject Subject = (Subject)o;
        System.out.println(this.name + "被" + Subject.getName() + "通知别炒股票了");
    }
}
