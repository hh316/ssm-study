package com.hh.mapper;

import com.hh.pojo.Employee;

import java.util.List;

public interface PageEmployeeMapper {
    //1.分页查询
    List<Employee> selectAllPageHelper();
}
