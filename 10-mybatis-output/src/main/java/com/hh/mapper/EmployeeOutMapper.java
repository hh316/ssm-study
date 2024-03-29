package com.hh.mapper;

import com.hh.pojo.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeOutMapper {
    //1.返回单个简单类型-根据id查询员工工资
    int selectSalaryById(int empId);
    //2.返回自定义实体-根据id查询员工信息
    Employee selectEmpById(int empId);
    //3.返回Map-根据id查询姓名和工资
    Map<String,Object> selectEmpNameAndMaxSalaryById(int empId);
    //4.返回集合-查询工资高于200的员工信息
    List<Employee> selectListEmpBySalary();
    //5.主键回显-插入员工
    int insertEmp(Employee employee);
 }
