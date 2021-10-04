package com.gavrilov.webcrud.service.impl;

import com.gavrilov.webcrud.entity.Student;
import com.gavrilov.webcrud.repository.StudentRepository;
import com.gavrilov.webcrud.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
