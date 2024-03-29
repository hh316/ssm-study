package com.hh.controller;

import com.hh.pojo.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("jsr")
public class JsrController {
    @PostMapping("data")
    //BindingResult必须紧跟有参数校验的实体
    public Object jsrTest(@Validated @RequestBody User user, BindingResult result){
        if(result.hasErrors()){
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("code","400");
            hashMap.put("msg","参数异常错误");
            return hashMap;
        }
        return user;
    }

}
