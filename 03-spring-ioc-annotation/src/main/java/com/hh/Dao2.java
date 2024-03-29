package com.hh;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 implements Dao{
    @Override
    public String daoShow() {
        return "dao2";
    }
}
