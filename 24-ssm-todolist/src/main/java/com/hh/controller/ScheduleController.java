package com.hh.controller;

import com.hh.pojo.Schedule;
import com.hh.service.ScheduleService;
import com.hh.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/schedule")
@Slf4j
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;
    //1.分页查询
    @GetMapping("/{pageSize}/{currentPage}")
    public R pageQuery(@PathVariable int pageSize, @PathVariable int currentPage){
        R r  = scheduleService.pageQuery(pageSize,currentPage);
        log.info("分页查询数据为：{ }",r);
        return r;
    }
    //2.删除
    @DeleteMapping("/{id}")
    public R removeById(@PathVariable int id){
        R r = scheduleService.removeById(id);
        return r;
    }
    //3.添加
    @PostMapping
    public R insert(@Validated @RequestBody Schedule schedule, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return R.fail("参数为空不能保存");
        }
        R r =scheduleService.insert(schedule);
        return r;
    }
    //4.修改
    @PutMapping
    public R update(@Validated @RequestBody Schedule schedule,BindingResult result){
        if(result.hasErrors()){
            return R.fail("参数不能为空");
        }
        R r = scheduleService.update(schedule);
        return r;
    }

}
