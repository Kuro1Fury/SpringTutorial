package com.example.spring6.aop.xmlaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// Aspect class
@Aspect // Aspect class
@Component // ioc container
public class LogAspect {

    // before advice
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger --> before method. Method name: " + methodName + ", args: " + Arrays.toString(args));
    }

    // after advice
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger --> after method. Method name: " + methodName);
    }


    // return advice
    // Get target method return value
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger --> after returning method. Method name: " + methodName + ", result: " + result);
    }

    // exception advice
    public void afterThrowingMethod(JoinPoint joinPoint, Exception ex) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger --> after throwing method. Method name: " + methodName + ", exception: " + ex);
    }

    // around advice
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
    @Pointcut(value="execution(public int com.example.spring6.aop.xmlaop.CalculatorImpl.*(..))")
    public void pointcut() {}
}
