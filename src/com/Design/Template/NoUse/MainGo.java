package com.Design.Template.NoUse;

/**
 * @Author Lc
 * @Date 2023/9/17
 * @PackageName: com.Design.Template.NoUse
 * @ClassName: MainGo
 * @Description:
 */

public class MainGo {
    public static void main(String[] args) {
        TestPaperA testPaperA = new TestPaperA();
        TestPaperB testPaperB = new TestPaperB();

        //小明做试卷
        testPaperA.testQuestion1();
        testPaperA.testQuestion2();
        testPaperA.testQuestion3();

        //小张做试卷
        testPaperB.testQuestion1();
        testPaperB.testQuestion2();
        testPaperB.testQuestion3();
    }
}
