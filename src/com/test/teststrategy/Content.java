package com.test.teststrategy;

/**
 * @Author Lc
 * @Date 2023/5/7
 * @Description 环境类
 */
public class Content {
    private People people;

    public Content(People people) {
         this.people = people;
    }

    public void choose(){
        people.zc();
    }
}
