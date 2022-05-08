package com.temitope.classSystem.service;

import com.temitope.classSystem.model.Student;

import java.util.List;

public interface StudentService {
     Student saveStudent(Student student);
     List<Student> getAllStudents();
}
