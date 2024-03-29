package com.hh.mapper;

import com.hh.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    //1.when-if--根据姓名和工资查询员工信息
    List<Employee> selectByNameAndSalary(@Param("empName") String empName, @Param("empSalary")double empSalary);
    //2.set-根据id修改员工信息
    int updateById(Employee employee);
    //3.trim--根据姓名和工资查询员工信息
    List<Employee> selectTrimByNameAndSalary(@Param("empName") String empName, @Param("empSalary")double empSalary);
    //4.closes--如果有姓名就根据姓名查询没有就工资否就查询全部
    List<Employee> selectChooseByNameAndSalary(@Param("empName") String empName, @Param("empSalary")double empSalary);
    //5.foreach--根据id批量查询
    List<Employee> selForeach(@Param("ids") List<Integer> ids);
    //6.foreach-根据id批量删除
    int delForeach(@Param("ids") List<Integer> ids);
    //7.foreach-批量添加员工
    int insertForeach(@Param("employees") List<Employee> employees);
    //8.foreach-批量根据id修改员工
    int updateForeach(@Param("list") List<Employee> employees);
}
