package com.example.student_management_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    @PostMapping("/teacher/add")
    public ResponseEntity addTeacher(@RequestBody Teacher teacher){
        String message=teacherService.addService(teacher);
        return new ResponseEntity(message, HttpStatus.CREATED);

    }

    @GetMapping("/teacher/get")
    public ResponseEntity<Teacher> getTeacherDetails (@RequestParam("name") String name){
        Teacher teacher= teacherService.getService(name);
        return new ResponseEntity<>(teacher,HttpStatus.OK);

    }
    @DeleteMapping("/teacher/delete")
    public ResponseEntity<String> delete(@RequestParam Integer id){
        teacherService.delete(id);
        return new ResponseEntity<>("Deleted",HttpStatus.OK);
    }
}
