package com.hh.service;

import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {
    //加法
    @Override
    public int add(int i, int j) {
        return i+j;
    }
     //减法
    @Override
    public int div(int i, int j) {
        return i-j;
    }
    //乘法
    @Override
    public int sub(int i, int j) {
        return i*j;
    }
    //除法
    @Override
    public int mul(int i, int j) {
        return i/j;
    }


}
