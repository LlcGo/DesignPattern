package com.test.iterator;

import com.lc.builderpattern.builder.demo2.Phone;

/**
 * @Author Lc
 * @Date 2023/5/10
 * @Description
 */
public  class Student {
    private String name;
    private Integer age;

    private  Student(Build build) {
        this.name = build.name;
        this.age = build.age;
    }

    public static final class  Build {
        private String name;
        private Integer age;

        public  Build Name(String name) {
            this.name = name;
            return this;
        }

        public Build  Age(Integer age) {
            this.age = age;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
