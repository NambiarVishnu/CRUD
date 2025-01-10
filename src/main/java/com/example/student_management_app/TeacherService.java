package com.example.student_management_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    public String addService(@RequestBody Teacher teacher){
        teacherRepository.add(teacher);
        return "Teacher added successfully";

    }

    public Teacher getService(String name){
        return teacherRepository.get(name);

    }

    public void delete(Integer id) {
        System.out.println(teacherRepository.teacherDb.size());
        teacherRepository.deleteTeacherById(id);

    }
}
