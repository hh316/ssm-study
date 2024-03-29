package com.hh.service.impl;

import com.hh.dao.StudentDao;
import com.hh.pojo.Student;
import com.hh.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAll() {
        List<Student> studentAll = studentDao.findAll();
        return studentAll;
    }
}
