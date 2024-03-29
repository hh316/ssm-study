package com.hh.controller;

import com.hh.pojo.Employee;
import com.hh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("ssm")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> empFindAll(){
        List<Employee> employeeList = employeeService.findAll();
        return employeeList;
    }
}
