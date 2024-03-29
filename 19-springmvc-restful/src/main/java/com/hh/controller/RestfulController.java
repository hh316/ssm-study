package com.hh.controller;

import com.hh.pojo.User;
import org.springframework.web.bind.annotation.*;

//mapper-映射  mapping-地图
@RestController
@RequestMapping("user")
public class RestfulController {
    //分页查询
    @GetMapping
    public String get(@RequestParam(required = false ,defaultValue = "1") int page,@RequestParam(required = false,defaultValue = "10") int size){
       return "分页查询"+page+size;
    }
    //用户添加--json格式填写多些少都没问题他只接受他想要的，也没有顺序要求
    @PostMapping()
    public String post(@RequestBody User user){
        return "用户添加"+user;
    }
    //用户查询
    @GetMapping("{id}")//不能有两这种路径传参因为都{*}所以即使key不同也会报错
    public String getById(@PathVariable int id){
        return "用户查询"+id;
    }
    //用户更新
    @PutMapping
    public String put(@RequestBody User user){
        return "用户更新"+user;
    }
    //用户删除
    @DeleteMapping("{id}")
    public String delete(@PathVariable int id){
        return "用户删除"+id;
    }
    //条件模糊查询
    @GetMapping("search")
    public String getSearch(@RequestParam(required = false,defaultValue = "1") int page,@RequestParam(required = false,defaultValue = "10") int size,@RequestParam(required = false) String keywork){
        return "条件模糊查询"+page+size+keywork;
    }
}
