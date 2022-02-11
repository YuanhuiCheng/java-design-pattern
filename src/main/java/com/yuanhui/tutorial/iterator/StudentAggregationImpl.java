package com.yuanhui.tutorial.iterator;

import java.util.ArrayList;
import java.util.List;

public class StudentAggregationImpl implements StudentAggregate {
    private final List<Student> list = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
