package com.lc.behavioralPattern.template.myTemplate;

/**
 * @Author Lc
 * @Date 2023/9/6
 * @PackageName: com.lc.behavioralPattern.template.myTemplate
 * @ClassName: Test
 * @Description:
 */

public abstract class Test {

    public String say(){
        return hello();
    }

    public abstract String hello();
}
