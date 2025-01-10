package com.example.student_management_app;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
//@RequestMapping("/student")
public class StudentController{

//    StudentService studentService = new StudentService();
    @Autowired
StudentService studentService;
    @GetMapping("/student/get")
    public ResponseEntity  getStudent(@RequestParam("id") int admNo) {

        Student student=  studentService.getStudent(admNo);
        return new ResponseEntity(student, HttpStatus.OK);
    }

    @GetMapping("/get-all-students")
    public ResponseEntity<List<String>> getAllStudent(){
        List<String> Students=studentService.getAll();
        return new ResponseEntity<>(Students,HttpStatus.OK);
    }

    @PutMapping("/pair")
    public ResponseEntity getPair(@RequestParam Integer studentId,@RequestParam Integer teacherId){
        studentService.getPair(studentId,teacherId);
        return new ResponseEntity("Student teacher pair added successfully",HttpStatus.OK);
    }

    @PostMapping("/student/add")
    public ResponseEntity addStudent(@RequestBody Student student){

        String message= studentService.addStudent(student);
        return new ResponseEntity(message,HttpStatus.CREATED);
    }


}

