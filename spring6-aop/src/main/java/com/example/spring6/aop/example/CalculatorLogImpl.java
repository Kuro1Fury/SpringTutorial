package com.example.spring6.aop.example;

// Calculator with log
public class CalculatorLogImpl implements Calculator {
    @Override
    public int add(int i, int j) {

        System.out.println("[log] add starts, parameters are {" + i + ", " + j + "}");

        int result = i + j;

        System.out.println("add is called, and result equals to " + result);

        System.out.println("[log] add ends, result is " + result);

        return result;
    }

    @Override
    public int sub(int i, int j) {

        System.out.println("[log] sub starts, parameters are {" + i + ", " + j + "}");

        int result = i - j;

        System.out.println("sub is called, and result equals to " + result);

        System.out.println("[log] sub ends, result is " + result);

        return result;
    }

    @Override
    public int mul(int i, int j) {

        System.out.println("[log] mul starts, parameters are {" + i + ", " + j + "}");
        int result = i * j;

        System.out.println("mul is called, and result equals to " + result);

        System.out.println("[log] mul ends, result is " + result);

        return result;
    }

    @Override
    public int div(int i, int j) {

        System.out.println("[log] div starts, parameters are {" + i + ", " + j + "}");
        int result = i / j;

        System.out.println("div is called, and result equals to " + result);

        System.out.println("[log] div ends, result is " + result);

        return result;
    }
}
