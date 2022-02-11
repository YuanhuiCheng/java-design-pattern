package com.yuanhui.tutorial.iterator;

import java.util.List;

public class StudentIteratorImpl implements StudentIterator {
    private final List<Student> list;
    private int position;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        return list.get(position++);
    }
}
