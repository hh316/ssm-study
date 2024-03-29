package com.hh.mapper;

import com.hh.pojo.Schedule;

import java.util.List;

public interface ScheduleMapper {


    List<Schedule> pageQuery();

    int removeById(int id);

    int insert(Schedule schedule);

    int update(Schedule schedule);
}
