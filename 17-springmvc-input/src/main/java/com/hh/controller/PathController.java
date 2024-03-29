package com.hh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//variable-变量
@Controller
@RequestMapping("path")
public class PathController {
    //路径传值 {key} =* 没有注解默认用param形式接值
    @RequestMapping("{account}/{password}")
    @ResponseBody public String pathLogin(@PathVariable(value = "account") String username,@PathVariable  String password,@PathVariable(required =false) String noRequired){
        return username+"....."+password;
    }
}
