package com.Design.Template.promt;

/**
 * @Author Lc
 * @Date 2023/9/17
 * @PackageName: com.Design.Template.promt
 * @ClassName: Template
 * @Description:
 */

public abstract class Template {

    public void Exams(){
        testQuestion1();
        testQuestion2();
        testQuestion3();
    }

    public void testQuestion1(){
        System.out.println("这是问题1 A.666 B.6666 C.66666 D.66666666 ");
        this.answer1();
    }
    public abstract void answer1();



    public void testQuestion2(){
        System.out.println("这是问题2 A.651566 B.6156166 C.651651666 D.66564656666 ");
        this.answer2();
    }
    public abstract void answer2();


    public void testQuestion3(){
        System.out.println("这是问题3 A.6656165166 B.66665645646546465 C.6666515616516 D.666666516516566");
        this.answer3();
    }
    public abstract void answer3();

}
