package com.hh;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@org.springframework.stereotype.Service
//基于注解的DI
public class Service {
    //佛系装配--没有daoBean
//    @Autowired(required = false)
//    private Dao dao;


//    多个daoBean的解决
////  方法1： autowired+qualifier
    @Autowired
    @Qualifier(value="dao1")
    private Dao dao;
//
//  方法2：@resource = autowired+qualifier
    @Resource(name = "dao2")
    private Dao newDao;

//

    public String show(){
        return dao.daoShow();
    }

    public String show2(){
        return newDao.daoShow();
    }

}
