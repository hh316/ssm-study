package com.hh.dao.impl;

import com.hh.dao.StudentDao;
import com.hh.pojo.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Student> findAll() {
        String sql = "select id,name,gender,age,class as classes from students";
        List<Student> studentAll = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
        return studentAll;
    }
}
