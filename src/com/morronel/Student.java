package com.morronel;

public class Student {
    private String name;
    private String studentNumber;

    public Student(String newName, String newStudentNumber) {
        name = newName;
        studentNumber = newStudentNumber;
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.studentNumber + ")";
    }
}
