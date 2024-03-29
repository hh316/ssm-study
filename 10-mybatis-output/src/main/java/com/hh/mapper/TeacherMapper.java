package com.hh.mapper;

import com.hh.pojo.Teacher;

public interface TeacherMapper {
    //1.非主键自增uuid维护--插入老师
    int insertTeacher(Teacher teacher);
    //2.resultMap--根据ID查询老师
    Teacher selectTeaById(int Tid);
}
