package com.hh.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("api")
@ResponseBody
public class apiController {
    @Autowired
    private ServletContext servletContext;
    @GetMapping("request")
    public String getRequest(HttpServletRequest request){
        System.out.println("request = " + request);
        servletContext = request.getServletContext();
        System.out.println("servletContext = " + servletContext);
        return "ok";
    }
    @GetMapping("response")
    public String getResponse(HttpServletResponse response){
        System.out.println("response = " + response);
        return "ok";
    }
    @GetMapping("session")
    public String getSession(HttpSession session){
        System.out.println("session = " + session);
        servletContext = session.getServletContext();
        System.out.println("servletContext = " + servletContext);
        return "ok";
    }

}
