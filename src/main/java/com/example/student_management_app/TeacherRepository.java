package com.example.student_management_app;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;

@Repository
public class TeacherRepository {
    HashMap<Integer, Teacher> teacherDb=new HashMap<>();

    public void add(@RequestBody Teacher teacher){
        teacherDb.put(teacher.getId(), teacher);
    }

    public Teacher get(String name){
        for(Teacher teacher: teacherDb.values()){
            if(teacher.getName().equals(name)){
                return teacher;

            }
        }
return null;
    }

    public String deleteTeacherById(Integer id) {
        Teacher removedTeacher = teacherDb.remove(id);  // Removes the teacher with the given ID
        if (removedTeacher != null) {
            return ("Teacher with ID " + id + " was removed.");
        } else {
            return ("Teacher with ID " + id + " not found.");
        }
    }




}
