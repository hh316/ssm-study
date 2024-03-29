package com.hh.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jsp")
public class JspController {
    @GetMapping("index")
    public String getJsp(HttpServletRequest request){
        //往共享域中设置属性
        request.setAttribute("data","hello jsp");
        return "index";
    }
}
