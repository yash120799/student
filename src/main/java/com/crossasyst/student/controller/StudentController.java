package com.crossasyst.student.controller;

import com.crossasyst.student.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping(path="/students/{studentId}", produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<Student> getStudent(@PathVariable Long studentId){
        Student std = new Student("yash","goyal");
        return new ResponseEntity<>(std , HttpStatus.OK);
    }

}
