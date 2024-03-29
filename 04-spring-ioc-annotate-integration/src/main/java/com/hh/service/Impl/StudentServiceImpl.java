package com.hh.service.Impl;

import com.hh.dao.Impl.StudentDaoImpl;
import com.hh.pojo.Student;
import com.hh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentDaoImpl studentDao;
    @Override
    public List<Student> findAll() {
        List<Student> studentDaoAll = studentDao.findAll();
        return studentDaoAll;
    }
}
