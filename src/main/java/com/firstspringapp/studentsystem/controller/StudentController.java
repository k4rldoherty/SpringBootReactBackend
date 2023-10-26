// Controllers:
//
// Role:
// Controllers handle incoming requests and direct traffic in your application.
//
// Simple Explanation:
// Controllers are like the traffic police of your application. They receive requests from users,
// figure out what needs to be done, and then make sure the appropriate model or service is called.
// In our to-do list app, a "TaskController" might handle requests to create a new task or display a list of tasks.

package com.firstspringapp.studentsystem.controller;

import com.firstspringapp.studentsystem.model.Student;
import com.firstspringapp.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student") // For path
@CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.POST})
public class StudentController {

    @Autowired
    private StudentService studentService; // Inject the StudentService dependency

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        // This method is a controller action to handle POST requests at the path "/student/add"

        // Call the StudentService to save the student data
        studentService.saveStudent(student);

        // Return a response message to the client
        return "Student added successfully";
    }
    @CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.GET})
    @GetMapping("/allstudents")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
