package com.example.students.controller;

import com.example.students.model.Student;
import com.example.students.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class StudentControler {
    private StudentService studentService;
    @Autowired


    public StudentControler(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }


  @PostMapping("/student")
   public void createStudent(@RequestParam("firstName")String firstName,@RequestParam("lastName")String lastName){
        studentService.createStudent(firstName,lastName);
   }








}
