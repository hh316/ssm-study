package com.hh.service;

import com.hh.pojo.Schedule;
import com.hh.utils.R;

public interface ScheduleService {
    R pageQuery(int pageSize,int currentPage);

    R removeById(int id);

    R insert(Schedule schedule);

    R update(Schedule schedule);
}
