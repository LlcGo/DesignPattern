package com.test.testobserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lc
 * @Date 2023/5/16
 * @Description
 */
public class SubjectContent implements Subject {
   private List<Observer> list = new ArrayList();

    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyState() {
        list.forEach(list -> {
            System.out.println(list.update());
        });
    }
}
