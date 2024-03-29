package com.hh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//5种请求方式RequestMapping -GetMapping -PostMapping -PutMapping -DeleteMapping-查改增删
@Controller
public class HelloController {

    //1.RequestMapping
    @RequestMapping("/RequestMapping")
    @ResponseBody
    public String HelloMapping(){
        return "RequestMapping";
    }
    //2.GetMapping--查询
    @GetMapping ("/GetMapping")
    @ResponseBody
    public String GetMapping(){
        return "GetMapping";
    }
    //3.PostMapping--添加
    @PostMapping("/PostMapping")
    @ResponseBody
    public String PostMapping(){
        return "PostMapping";
    }
    //4.PutMapping--修改
    @PutMapping("/PutMapping")
    @ResponseBody
    public String PutMapping(){
        return "PutMapping";
    }
    //5.DeleteMapping--删除
    @DeleteMapping("/DeleteMapping")
    @ResponseBody
    public String DeleteMapping(){
        return "DeleteMapping";
    }

}
