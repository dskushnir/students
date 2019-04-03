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
        studentIdToStudent.put(student1.getId(),student1);
        studentIdToStudent.put(student2.getId(),student2);
        studentIdToStudent.put(student3.getId(),student3);


    }
  /*  public Student getStudent(String id) {
        return studentIdToStudent.get(id);
    }*/



    public void save(Student student) {
        studentIdToStudent.put(student.getId(), student);
    }





    public List<Student> findAll() {
        return studentIdToStudent.values().stream().collect(Collectors.toList());
    }
}
