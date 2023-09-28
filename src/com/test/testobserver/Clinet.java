package com.test.testobserver;

/**
 * @Author Lc
 * @Date 2023/5/16
 * @Description
 */
public class Clinet {
    public static void main(String[] args) {
        SubjectContent subjectContent = new SubjectContent();
        QQmessage qQmessage = new QQmessage();
        Wxmessage wxmessage = new Wxmessage();
        subjectContent.add(qQmessage);
        subjectContent.add(wxmessage);
        subjectContent.notifyState();
    }
}
