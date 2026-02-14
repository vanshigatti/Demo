package com.example;

public class StudentService {
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public void showDetails() {
        student.display();
    }
}
