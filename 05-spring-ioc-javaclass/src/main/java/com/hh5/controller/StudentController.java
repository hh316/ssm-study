package com.hh5.controller;

import com.hh5.pojo.Student;
import com.hh5.service.Impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;
    public List<Student> findAll(){
        List<Student> studentServiceAll = studentService.findAll();
        return studentServiceAll;
    }
}
