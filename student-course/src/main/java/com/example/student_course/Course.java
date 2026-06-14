package com.example.student_course;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long course_id;
    private String course_name;
    private Long id;

    public Course(){}

    public Course(String course_name){
        this.course_name = course_name;
    }

    public String getCourse_name(){
        return course_name;
    }
    public void setCourse_name(String course_name){
        this.course_name = course_name;
    }

    public long getCourse_id() {
        return course_id;
    }


}
