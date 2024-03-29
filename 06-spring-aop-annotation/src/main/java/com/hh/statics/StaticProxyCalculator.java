package com.hh.statics;

import com.hh.service.Calculator;

public class StaticProxyCalculator implements Calculator {
    private Calculator calculator;

    public StaticProxyCalculator(Calculator calculatorPure) {
        this.calculator = calculatorPure;
    }

    @Override
    public int add(int i, int j) {
        int add = calculator.add(i, j);
        System.out.println("静态代理 i+j = " + add);
        return add;
    }

    @Override
    public int div(int i, int j) {
        int div = calculator.div(i, j);
        System.out.println("静态代理 i-j = " + div);
        return div;
    }

    @Override
    public int sub(int i, int j) {
        int sub = calculator.sub(i, j);
        System.out.println("静态代理 i*j = " + sub);
        return sub;
    }

    @Override
    public int mul(int i, int j) {
        int mul = calculator.mul(i, j);
        System.out.println("静态代理 i/j = " + mul);
        return mul;
    }


}
