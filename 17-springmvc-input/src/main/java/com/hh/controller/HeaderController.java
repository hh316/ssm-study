package com.hh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("header")
@ResponseBody
public class HeaderController {
    @GetMapping("getHost")
    public String getHeader(@RequestHeader String host){
        return host;
    }
    @GetMapping("getAccept")
    public String getAccept(@RequestHeader String accept){
        return accept;
    }
    @GetMapping("getConnection")
    public String getConnection(@RequestHeader String Connection){
        return Connection;
    }
    @GetMapping("getAccept-Encoding")
    public String getAcceptEncoding(@RequestHeader("Accept-Encoding") String AcceptEncoding){
        return AcceptEncoding;
    }
}
