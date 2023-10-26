package com.firstspringapp.studentsystem.service;

import com.firstspringapp.studentsystem.model.Student;

import java.util.List;


public interface StudentService {

    public void saveStudent(Student student); // just name the methods here, the code goes into the java class
    public List<Student> getStudents(); // returns a list of Student objects

}
