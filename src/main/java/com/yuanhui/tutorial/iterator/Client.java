package com.yuanhui.tutorial.iterator;

public class Client {
    public static void main(String[] args) {
        StudentAggregationImpl aggregate = new StudentAggregationImpl();
        aggregate.addStudent(new Student("Dawn", "20611625"));
        aggregate.addStudent(new Student("Jack", "20123456"));
        aggregate.addStudent(new Student("Jennie", "20654321"));

        StudentIterator iterator = aggregate.getStudentIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.toString());
        }
    }
}
