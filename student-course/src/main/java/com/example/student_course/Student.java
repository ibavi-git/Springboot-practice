package com.example.student_course;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String department;

    public Student(){}

    public Student(String name,String department){
        this.name = name;
        this.department = department;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
    }





}
