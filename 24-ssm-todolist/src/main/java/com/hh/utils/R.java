package com.hh.utils;

import lombok.Data;

//返回结果类
@Data
public class R {
    private int code = 200;
    private boolean flag =true;
    private Object data;

    public static R ok(Object data){
        R r = new R();
        r.data =data;
        return r;
    }

    public static R fail(Object data){
        R r = new R();
        r.code = 500;
        r.flag =false;
        r.data =data;
        return r;
    }
}
