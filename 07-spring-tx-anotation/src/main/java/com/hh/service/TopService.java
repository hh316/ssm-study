package com.hh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TopService {
    @Autowired
    private  TxStudentService txStudentService;
    public void topService(){
        txStudentService.changeAge();
        txStudentService.changeName();
        int i = 1/0;
    }
}
