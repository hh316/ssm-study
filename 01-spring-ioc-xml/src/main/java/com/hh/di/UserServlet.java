package com.hh.di;

public class UserServlet {
    private int age ;
    private String name;
    private UserService userService;

    public UserServlet(int age, String name, UserService userService) {
        this.age = age;
        this.name = name;
        this.userService = userService;
    }

    public UserServlet() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
