package com.example.student_profile_demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {


    private final StudentRepository repo = new StudentRepository();

    @GetMapping
    public List<UserProfile> getStudents(){
        return repo.findAll();
    }

    @PostMapping
    public UserProfile addStudent(@RequestBody UserProfile s){
        repo.save(s);
        return s;
    }

}
