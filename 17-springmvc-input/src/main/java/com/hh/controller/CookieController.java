package com.hh.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("cookie")
@ResponseBody
public class CookieController {
    //添加Cookie
    @PutMapping("put")
    public String insertCookie(HttpServletResponse response){
        Cookie cookie = new Cookie("cookieName", "root");
        response.addCookie(cookie);
        return  "ok";
    }
    //获取cookie
    @GetMapping("get")
    public String getCookie(@CookieValue("cookieName") String cookieName){
        System.out.println("cookieName = " + cookieName);
        return cookieName;
    }
}
