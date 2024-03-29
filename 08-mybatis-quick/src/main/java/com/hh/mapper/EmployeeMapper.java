package com.hh.mapper;

import com.hh.pojo.Employee;

public interface EmployeeMapper {
    Employee queryById(Integer id);
    void deleteById(Integer id);

}
