package com.example.student_management_app;

public class Student {

    private int admNo;
    private String name;
    private String email;
    private String course;

    public Student() {
    }

    public Student(int admNo, String name, String email, String course) {
        this.admNo = admNo;
        this.name = name;
        this.email = email;
        this.course = course;
    }

    // Getters and Setters
    public int getAdmNo() {
        return admNo;
    }

    public void setAdmNo(int admNo) {
        this.admNo = admNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "admNo=" + admNo +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
