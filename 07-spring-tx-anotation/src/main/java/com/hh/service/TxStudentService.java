package com.hh.service;

import com.hh.dao.TXStudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
/*

 */
@Service
@Transactional(isolation = Isolation.READ_COMMITTED)
public class TxStudentService {
    @Autowired
    private TXStudentDao txStudentDao;
    @Transactional(timeout = 3,rollbackFor=Exception.class,noRollbackFor= IOException.class)//超时时间
    public void  updateStudents()  {
//        try {
////            new FileInputStream("xxxx");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        txStudentDao.updateNameById("hahahah",1);
//        int i =1/0;
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        txStudentDao.updateAgeById(3444,1);
        System.out.println("修改完成");
    }
    @Transactional(readOnly = true)//只读
    public void findStudent(){

    }

     //
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void changeAge(){
        txStudentDao.updateAgeById(7777,1);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void changeName(){
        txStudentDao.updateNameById("aaa",1);
    }


}
