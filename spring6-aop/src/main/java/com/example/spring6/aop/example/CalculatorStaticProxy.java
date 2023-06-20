package com.example.spring6.aop.example;

// Static proxy
public class CalculatorStaticProxy implements Calculator {

    // Get the proxy object
    private Calculator calculator;

    public CalculatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int i, int j) {
        // Output log
        System.out.println("[log] add starts, parameters are {" + i + ", " + j + "}");

        // Call the method of the target object
        int result = calculator.add(i, j);

        System.out.println("[log] add ends, result is " + result);

        return result;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("[log] sub starts, parameters are {" + i + ", " + j + "}");

        int result = calculator.sub(i, j);

        System.out.println("[log] sub ends, result is " + result);

        return result;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("[log] mul starts, parameters are {" + i + ", " + j + "}");

        int result = calculator.mul(i, j);

        System.out.println("[log] mul ends, result is " + result);

        return result;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("[log] div starts, parameters are {" + i + ", " + j + "}");

        int result = calculator.div(i, j);

        System.out.println("[log] div ends, result is " + result);

        return result;
    }
}
