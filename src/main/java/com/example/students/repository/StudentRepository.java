package com.example.students.repository;

import com.example.students.model.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
@Repository

public class StudentRepository {
    private static Map<String, Student> studentIdToStudent = new HashMap<>();
    static {
        initStudents();


    }

    private static void initStudents() {
        Student student1 = new Student("01", "Ivan", "Ivanov");
        Student student2 = new Student("02", "Petr", "Petrov");
        Student student3 = new Student("03", "Jack","Born");
        save(student1);
        save(student2);
        save(student3);



    }


    public static void save(Student student) {
        studentIdToStudent.put(student.getId(), student);
    }


    public List<Student> findAll() {
        return studentIdToStudent.values().stream().collect(Collectors.toList());
    }
}
