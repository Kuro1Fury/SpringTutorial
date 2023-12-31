package com.example.spring6.aop.annoaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// Aspect class
@Aspect // Aspect class
@Component // ioc container
public class LogAspect {

    // Set pointcut and advice type
    // Pointcut expression: execution(<public/private> <return type> <package name>.<class name>.<method name>(<parameters>))
    // advice types:
    // before: @Before(value="pointcut expression")
    @Before(value="com.example.spring6.aop.annoaop.LogAspect.pointcut()")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger --> before method. Method name: " + methodName + ", args: " + Arrays.toString(args));
    }

    // after: @After()
    @After(value="pointcut()")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger --> after method. Method name: " + methodName);
    }


    // return: @AfterReturning()
    @AfterReturning(value="execution(public int com.example.spring6.aop.annoaop.CalculatorImpl.*(..))", returning="result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger --> after returning method. Method name: " + methodName + ", result: " + result);
    }

    // exception: @AfterThrowing() (get error message)
    // Execute this method when exception is thrown
    @AfterThrowing(value="execution(public int com.example.spring6.aop.annoaop.CalculatorImpl.*(..))", throwing="ex")
    public void afterThrowingMethod(JoinPoint joinPoint, Exception ex) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger --> after throwing method. Method name: " + methodName + ", exception: " + ex);
    }

    // around: @Around()
    @Around(value="execution(public int com.example.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        String argString = Arrays.toString(args);
        Object result = null;
        try {
            System.out.println("Logger --> around method (before method). Method name: " + methodName + ", args: " + argString);

            // Call target method
            result = joinPoint.proceed();

            System.out.println("Logger --> around method (after return). Method name: " + methodName + ", result: " + result);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("Logger --> around method (exception). Method name: " + methodName + ", exception: " + throwable);
        } finally {
            System.out.println("Logger --> around method (after). Method name: " + methodName);
        }

        return result;
    }

    // Reuse pointcut expression
    @Pointcut(value="execution(public int com.example.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public void pointcut() {}
}
