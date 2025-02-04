package com.hh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jsp")
public class ForwardAndRedirectController {
    //1.转发-地址不变
    @GetMapping("forward")
    public String forward(){
            return "forward:index";
        }

    //2.重定向-地址刷新-再在请求
    @GetMapping("redirect")
    public String redirect(){
        return "redirect:index";
    }
    
    //2.重定向-地址刷新-再在请求
    @GetMapping("redirect/baidu")
    public String redirectBaidu(){
        return "redirect:http://www.baidu.com";
    }
}
