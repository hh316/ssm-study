package com.hh.mapper;

import com.hh.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
   //1.单个简单类型参数-根据id查询员工信息
    Employee selectEmployeeById(Integer empId);
   //2.多个简单值类型参数-根据id和姓名查询员工信息
    List<Employee> selectEmployeeByIdAndName(@Param("empId") Integer empId, @Param("empName") String empName);
    //3.实体参数-插入员工
    int insertEmployee(Employee employee);
    //4.map参数-插入员工
    int insertEmpMap(Map<String,Object> data);
    //5.List<实体>--@param("")
}
