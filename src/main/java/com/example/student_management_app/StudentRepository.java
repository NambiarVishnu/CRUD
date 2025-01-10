package com.example.student_management_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class StudentRepository {
    @Autowired
    TeacherRepository teacherRepository;
    HashMap<Integer, Student> studentDb=new HashMap<>();

//    HashMap<Integer, Student> studentDb=new HashMap<>();

    HashMap<Integer, List<Integer>> studentTeacherDb=new HashMap<>();

    public Student getStudent(int admNo){
        return studentDb.get(admNo);
    }

    public void add(@RequestBody Student student){
        studentDb.put(student.getAdmNo(),student);
    }


    public List<String> getAll() {
        List<String> stud =new ArrayList<>();
        for(Integer id: studentDb.keySet()){
            stud.add(studentDb.get(id).getName());
        }
        return stud;
    }

    public void pair(Integer studentId, Integer teacherId) {
        if(studentDb.containsKey(studentId)&& teacherRepository.teacherDb.containsKey(teacherId)){
                if(!studentTeacherDb.containsKey(teacherId)){
                    studentTeacherDb.put(teacherId,new ArrayList<>());
            }
                studentTeacherDb.get(teacherId).add(studentId);
        }

    }
}
