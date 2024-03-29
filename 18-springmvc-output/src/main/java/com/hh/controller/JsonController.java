package com.hh.controller;

import com.hh.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //@Controller+@responseBody
@RequestMapping("json")
public class JsonController {
    //@response注解不会走视图解析器，直接把响应体里的数据返回，转发和重定向都失效
    //对象{ }
    @GetMapping("data")
    public User data(){
        User user = new User();
        user.setName("hh");
        user.setGender("boy");
        user.setAge(18);
        return user;
    }
   //集合 [ {},{}   ]
    @GetMapping("datalist")
    public List<User> dataList(){
        User user = new User();
        user.setName("hh");
        user.setGender("boy");
        user.setAge(18);
        User user1 = new User();
        user1.setName("hh");
        user1.setGender("boy");
        user1.setAge(18);
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        return users;
    }
}
