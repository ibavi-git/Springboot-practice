package com.example.postgresdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface NameRepository extends JpaRepository<Users,Long> {
}
