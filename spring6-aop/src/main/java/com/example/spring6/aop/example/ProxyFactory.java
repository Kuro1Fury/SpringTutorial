package com.example.spring6.aop.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    // Target object
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // Return proxy object
    public Object getProxy() {
        /**
         * Proxy.newProxyInstance() has three parameters
         * 1. ClassLoader: ClassLoader of dynamic target object
         * 2. Class[] Interfaces: Array of classes that include all interfaces of target object
         * 3. InvocationHandler: The process of setting target object's method
         */
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();

        InvocationHandler invocationHandler = new InvocationHandler() {

            // 1. proxy: proxy object
            // 2. method: method of target object that will be overridden
            // 3. args: arguments of method
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // Before method
                System.out.println("[dynamic proxy][log]" + method.getName() + ", parameters: " + args);
                // Call target object's method
                Object result = method.invoke(target, args);
                // After method
                System.out.println("[dynamic proxy][log]" + method.getName() + ", result: " + result);
                return result;
            }
        };

        return Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);


        // InvocationHandler is a functional interface, so we can use lambda expression
//        return Proxy.newProxyInstance(classLoader, interfaces, (proxy, method, args) -> {
//            System.out.println("Before method");
//            Object result = method.invoke(target, args);
//            System.out.println("After method");
//            return result;
//        });
    }
}
