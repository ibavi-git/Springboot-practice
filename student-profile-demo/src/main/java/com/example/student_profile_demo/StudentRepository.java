package com.example.student_profile_demo;

import java.util.*;

public class StudentRepository {
    private final List<UserProfile> students = new ArrayList<>();
    public List<UserProfile> findAll(){
        return students;
    }
    public void save(UserProfile s){
        students.add(s);
    }
}
