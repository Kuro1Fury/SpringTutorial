package com.example.spring6.aop.annoaop;

import org.springframework.stereotype.Component;

// Basic Implementation
@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {


        int result = i + j;

        System.out.println("add is called, and result equals to " + result);

        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;

        System.out.println("sub is called, and result equals to " + result);

        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;

        System.out.println("mul is called, and result equals to " + result);

        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;

        System.out.println("div is called, and result equals to " + result);

        return result;
    }
}
