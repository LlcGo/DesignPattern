package com.lc.iterator;

public interface StudentAggregate {
    void addStudent(Student student);

    void removeStudent(Student student);

    Studentlterator getStudentlterator();
}
