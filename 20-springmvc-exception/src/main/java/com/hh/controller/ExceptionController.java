package com.hh.controller;

import com.hh.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("exception")
public class ExceptionController {
    @GetMapping("first")
    public String firstException(){
        User user = null;
        user.toString();
        return "ok";
    }
    @GetMapping("second")
    public String secondException(){
//        int i = 1/0;
        return "ok";
    }
}
