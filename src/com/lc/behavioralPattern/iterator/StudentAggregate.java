package com.lc.behavioralPattern.iterator;

public interface StudentAggregate {
    void addStudent(Student student);

    void removeStudent(Student student);

    Studentlterator getStudentlterator();
}
