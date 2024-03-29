package com.hh.dao.Impl;


import com.hh.dao.StudentDao;
import com.hh.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Student> findAll() {
        String sql = "select id,name,gender,age,class as classes from students";
        List<Student> studentAll = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
        return studentAll;
    }
}
