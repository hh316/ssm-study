package com.hh.dao;

import com.hh.pojo.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAll();
}
