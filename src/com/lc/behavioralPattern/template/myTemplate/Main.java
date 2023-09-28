package com.lc.behavioralPattern.template.myTemplate;

/**
 * @Author Lc
 * @Date 2023/9/6
 * @PackageName: com.lc.behavioralPattern.template.myTemplate
 * @ClassName: Main
 * @Description:
 */

public class Main {
    public static void main(String[] args) {
        Test test = new Testinherit();
        System.out.println(test.say());
        Test test1 = new TestInherittwo();
        System.out.println(test1.say());
    }
}
