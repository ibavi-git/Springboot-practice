package com.example.h2db;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Student(){}

    public Student(String name){
        this.name=name;
    }

    public Long getId() {
        return id;
    }

    public String getName(){
        return name;
    }
}

