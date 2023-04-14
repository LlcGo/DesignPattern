package com.lc.iterator;

import java.util.ArrayList;

/**
 * @Author Lc
 * @Date 2023/4/14
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        //放入学生
        StudentAggregatelmpl studentAggregatelmpl = new StudentAggregatelmpl();
        studentAggregatelmpl.addStudent(new Student("小明","16"));
        studentAggregatelmpl.addStudent(new Student("小军","16"));
        studentAggregatelmpl.addStudent(new Student("小李","16"));
        studentAggregatelmpl.addStudent(new Student("小天","16"));

//        获取迭代器
        Studentlterator studentlterator = studentAggregatelmpl.getStudentlterator();
        while (studentlterator.hasNext()){
            Student next = studentlterator.next();
            System.out.println(next);
        }
    }
}
