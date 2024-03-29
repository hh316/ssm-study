package com.hh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("intertest")
public class InterTestController {
    @GetMapping("data")
    public String interData(){
        System.out.println("intertest");
        return "InterTestOk";
    }

}
