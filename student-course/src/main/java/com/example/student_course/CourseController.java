package com.example.student_course;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private final CourseRepository repo;

    public CourseController(CourseRepository repo){
        this.repo = repo;
    }

    @GetMapping
    public List<Course> getAll(){
        return repo.findAll();
    }

    @PostMapping
    public Course add(@RequestBody Course c){
        return repo.save(c);
    }


}

