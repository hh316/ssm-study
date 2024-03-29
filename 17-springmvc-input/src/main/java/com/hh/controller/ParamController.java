package com.hh.controller;

import com.hh.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ParamController {
    //1.参数名相同-必须有值
    @RequestMapping("/param1")
    @ResponseBody
    public String param1(String name,int age){
        return "name=" +name+"   age="+age;
    }
    //2.@RequestParam(value="",required=false,defaultValue="")注解-可设置
    @RequestMapping("/param2")
    @ResponseBody
    public String param2(@RequestParam(value = "Name") String name, @RequestParam(required = false,defaultValue = "2") int age){
        return "@RequestParam() name=" +name+"   age="+age;
    }
    //3.集合
    @RequestMapping("/param3")
    @ResponseBody
    public String param3(@RequestParam List<String> hobby){
        return "集合 爱好" +hobby;
    }
    //4.实体-可以没参数
    @RequestMapping("/param4")
    @ResponseBody
    public String param4(User user){
        System.out.println("user = " + user);
        return "实体" +user;
    }
}
