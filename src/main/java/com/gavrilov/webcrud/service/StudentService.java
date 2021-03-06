package com.gavrilov.webcrud.service;

import com.gavrilov.webcrud.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    List<Student> listAll(String keyword);
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudentById(Long id);
}
