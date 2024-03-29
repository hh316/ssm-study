package com.hh.service.Impl;

import com.hh.mapper.EmployeeMapper;
import com.hh.pojo.Employee;
import com.hh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> findAll() {
       List<Employee> employeeList= employeeMapper.findAll();
        return employeeList;
    }
}
