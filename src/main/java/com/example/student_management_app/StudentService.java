package com.example.student_management_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public Student getStudent(int admNo){
        return studentRepository.getStudent(admNo);
    }

    public String addStudent(@RequestBody Student student){
         studentRepository.add(student);
         return  "Student added successfully";

    }
}
