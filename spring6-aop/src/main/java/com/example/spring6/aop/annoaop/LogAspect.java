package com.example.spring6.aop.annoaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// Aspect class
@Aspect // Aspect class
@Component // ioc container
public class LogAspect {

    // Set pointcut and notice type
    // Pointcut expression: execution(<public/private> <return type> <package name>.<class name>.<method name>(<parameters>))
    // notice types:
    // before: @Before(value="pointcut expression")
    @Before(value="execution(public int com.example.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public void beforeMethod() {
        System.out.println("Logger --> before method.");
    }

    // return: @AfterReturning()
    // exception: @AfterThrowing()
    // after: @After()
    // around: @Around()
}
