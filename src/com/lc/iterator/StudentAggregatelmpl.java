package com.lc.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Lc
 * @Date 2023/4/14
 * @Description 迭代器角色具体类
 */
public class StudentAggregatelmpl implements StudentAggregate{
    private List<Student> list = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
            list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
            list.remove(student);
    }

    @Override
    public Studentlterator getStudentlterator() {
        return new Studentlteratorlmpl(list);
    }

}
