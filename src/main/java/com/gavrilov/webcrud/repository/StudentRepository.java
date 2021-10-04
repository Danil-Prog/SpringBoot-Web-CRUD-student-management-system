package com.gavrilov.webcrud.repository;

import com.gavrilov.webcrud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
