package com.hh5.service.Impl;

import com.hh5.dao.Impl.StudentDaoImpl;
import com.hh5.pojo.Student;
import com.hh5.service.StudentService;
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
