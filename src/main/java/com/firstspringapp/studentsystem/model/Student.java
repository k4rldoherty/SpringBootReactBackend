// Models:
//
// Role:
//        Models represent the data and business logic of your application.
//
// Simple Explanation:
//        Think of models as the objects that define the structure of your data. For example,
//        if you're building a to-do list application, your "Task" model could define what a task is, including its title,
//        description, due date, and other attributes.

package com.firstspringapp.studentsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id // Marks as a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // makes the ID auto Incremented
    private int id;
    private String name;
    private String address;

    // Alt + Insert -> Getter and Setters to auto generate getters and setters

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
