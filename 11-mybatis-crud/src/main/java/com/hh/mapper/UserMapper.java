package com.hh.mapper;

import com.hh.pojo.User;

import java.util.List;

public interface UserMapper {
    int insertUser(User user);
    int deleteUserById(int id);
    int updateUser(User user);
    User selectUserById(Integer id);
    List<User> selectUserAll();
}
