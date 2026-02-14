package com.example;

public class Student {
    private String name;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
