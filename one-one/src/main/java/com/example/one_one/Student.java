package com.example.one_one;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id")   // FK in student table
    private StudentProfile profile;

}
