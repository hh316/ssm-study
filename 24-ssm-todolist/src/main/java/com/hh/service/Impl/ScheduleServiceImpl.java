package com.hh.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hh.mapper.ScheduleMapper;
import com.hh.pojo.Schedule;
import com.hh.service.ScheduleService;
import com.hh.utils.PageBean;
import com.hh.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    private ScheduleMapper scheduleMapper;

    @Override
    public R pageQuery(int currentPage,int pageSize) {
        //加入分页
        PageHelper.startPage(currentPage,pageSize);
        //查询
        List<Schedule> scheduleList =scheduleMapper.pageQuery();
        //分页数据装配
        PageInfo<Schedule> PageInfo = new PageInfo<>(scheduleList);
        //PageBean装配
        PageBean<Schedule> pageBean = new PageBean<>(currentPage,pageSize,PageInfo.getTotal(), PageInfo.getList());
        //装配返回类R
        R ok = R.ok(pageBean);
        return ok;
    }

    @Override
    public R removeById(int id) {
        int rows =scheduleMapper.removeById(id);
        if(rows>0){
            return R.ok(null);
        }
        return R.fail(null);
    }

    @Override
    public R insert(Schedule schedule) {
        int rows = scheduleMapper.insert(schedule);
        if(rows>0){
            return R.ok(null);
        }
        return R.fail(null);
    }

    @Override
    public R update(Schedule schedule) {
        if (schedule.getId() == null) {
            return R.fail("核心id参数为null，无法修改！");
        }
        int rows = scheduleMapper.update(schedule);
        if(rows >0 ){
            return R.ok(null);
        }
        return R.fail(null);
    }
}
