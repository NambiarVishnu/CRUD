package com.example.student_management_app;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;

@Repository
public class StudentRepository {
    HashMap<Integer, Student> studentDb=new HashMap<>();

    public Student getStudent(int admNo){
        return studentDb.get(admNo);
    }

    public void add(@RequestBody Student student){
        studentDb.put(student.getAdmNo(),student);
    }

}
