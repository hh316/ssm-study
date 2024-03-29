package com.hh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("interceptor")
public class InterceptorController {
    @GetMapping("data")
    public String interData() {
        System.out.println("data");
        return "DataOk";
    }
    @GetMapping("data2")
    public String interData2(){
        System.out.println("data2");
        return "Data2Ok";
    }

}
