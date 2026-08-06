package com.aswani.placement_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aswani.placement_system.entity.Student;
import com.aswani.placement_system.service.StudentService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TestController {

    @Autowired
    private StudentService studentService;

    // Home API
    @GetMapping("/")
    public String home() {
        return "College Placement Management System Running Successfully";
    }

    // Add Student
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    // Get All Students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // Get Student By ID
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    // Update Student
    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable Long id,
                                 @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    // Delete Student
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }
}