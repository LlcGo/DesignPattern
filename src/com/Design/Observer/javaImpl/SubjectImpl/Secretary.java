package com.Design.Observer.javaImpl.SubjectImpl;

import com.Design.Observer.javaImpl.Subject;

import java.util.Observable;

/**
 * @Author Lc
 * @Date 2023/9/21
 * @PackageName: com.Design.Observer.myObserver.SubjectImpl
 * @ClassName: Secretary
 * @Description: 秘书类 负责通知
 */

public class Secretary extends Subject {

    public Secretary(String name) {
        super(name);
    }
}
