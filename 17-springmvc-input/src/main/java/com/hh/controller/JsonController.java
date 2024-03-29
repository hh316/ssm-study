package com.hh.controller;

import com.hh.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("json")
@ResponseBody
public class JsonController {
    //json格式要引入依赖并且在配置类中加入EnableWebMvc 同时去掉HandlerAdapter
    @PostMapping("data")
    public String data(@RequestBody User user){
        System.out.println("user = " + user);
        return user.toString();
    }
}
