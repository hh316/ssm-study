package com.hh.di;

public class UserService {
    private int age;
    private String name;
    private UserDao userDao;
    public UserService(UserDao UserDao){
        this.userDao = UserDao;
    }

    public UserService(int age, String name, UserDao userDao) {
        this.age = age;
        this.name = name;
        this.userDao = userDao;
    }


}
