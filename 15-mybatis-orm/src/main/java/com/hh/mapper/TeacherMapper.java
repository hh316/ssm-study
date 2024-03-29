package com.hh.mapper;

import com.hh.pojo.Teacher;

/**
* @author 16353
* @description 针对表【teacher】的数据库操作Mapper
* @createDate 2024-03-01 16:34:35
* @Entity com.hh.pojo.Teacher
*/
public interface TeacherMapper {
    //删除
    int deleteByPrimaryKey(Long id);
    //添加
    int insert(Teacher record);
    //可选择性的添加--Selective(可选择的)
    int insertSelective(Teacher record);
    //查询
    Teacher selectByPrimaryKey(Long id);
    //可选择性的修改
    int updateByPrimaryKeySelective(Teacher record);
    //修改
    int updateByPrimaryKey(Teacher record);

}
