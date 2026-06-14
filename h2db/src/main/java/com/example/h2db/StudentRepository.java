package com.example.h2db;

import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository is a JPA interface, has common crud methods

public interface StudentRepository extends JpaRepository<Student,Long> {
    //we extend it , to automatically get methods (save, findAll, etc) which are generated at runtime
    //<Student,Long> => Student tells jpa which entity this repo manages
    //                  Long tells the jpa the type of the primary key
    // since Student entity has private long id, you specify long

}
