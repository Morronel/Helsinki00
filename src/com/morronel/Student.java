package com.morronel;

public class Student {
    String name;
    String studentNumber;

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public Student(String newName, String newStudentNumber) {
        name = newName;
        studentNumber = newStudentNumber;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.studentNumber + ")";
    }
}
