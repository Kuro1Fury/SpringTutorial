package com.example.spring6.aop.example;

public class TestCalculator {

    public static void main(String[] args) {
        // Create proxy object (dynamic proxy)
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1, 2);
    }
}
