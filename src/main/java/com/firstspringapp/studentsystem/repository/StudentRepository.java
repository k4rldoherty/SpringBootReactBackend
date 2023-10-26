// Repositories:
//
// Role:
//        Repositories are responsible for data access and storage.
//
// Simple Explanation:
//        Repositories are like the gatekeepers to your data.
//        They handle tasks like saving, retrieving, updating, and deleting data from a database.
//        In our to-do list example, the "TaskRepository" might be in charge of storing and retrieving task data.

package com.firstspringapp.studentsystem.repository;

import com.firstspringapp.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> { // JpaRepository<NameOfObject, TypeOfPrimaryKey>
}
