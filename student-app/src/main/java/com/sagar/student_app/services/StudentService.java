package com.sagar.student_app.services;

import com.sagar.student_app.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentById(int id);

    Student saveStudent(Student student);

    Student updateStudent(int id, Student student);

    void deleteStudent(int id);

}