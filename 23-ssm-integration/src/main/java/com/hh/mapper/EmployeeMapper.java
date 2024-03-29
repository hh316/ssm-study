package com.hh.mapper;

import com.hh.pojo.Employee;

import java.util.List;
public interface EmployeeMapper {
    List<Employee> findAll();
}
