package com.firstspringapp.studentsystem.service;

import com.firstspringapp.studentsystem.model.Student;
import com.firstspringapp.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
    private StudentRepository studentRepository; // inject the student repository into the service

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

}
