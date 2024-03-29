package com.hh.controller;

import com.hh.pojo.Student;
import com.hh.service.StudentService;

import java.util.List;

public class StudentController {
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public List<Student> findAll(){
        List<Student> students = studentService.findAll();
        return students;
    }
}
