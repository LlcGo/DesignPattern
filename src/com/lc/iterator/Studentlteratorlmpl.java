package com.lc.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lc
 * @Date 2023/4/14
 * @Description 具体迭代器角色类
 */
public class Studentlteratorlmpl implements Studentlterator{
    private List<Student> list;
    private int position = 0; //记录遍历位置


    public Studentlteratorlmpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        Student student = list.get(position);
        position++;
        return student;
    }
}
