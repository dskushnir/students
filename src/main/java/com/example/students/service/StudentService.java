package com.example.students.service;

import com.example.students.model.Student;
import com.example.students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class StudentService {
    private IdGenerator idGenerator = new IdGenerator();
   @Autowired
   private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(String firstName, String lastName) {
        String id = idGenerator.generateId();

        Student student = new Student(id, firstName, lastName);

        studentRepository.save(student);
        return student;
    }


    public List<Student> findAll() {
        return studentRepository.findAll();
    }

}
