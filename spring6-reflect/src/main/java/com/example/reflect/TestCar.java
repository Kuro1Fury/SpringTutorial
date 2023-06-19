package com.example.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestCar {

    // 1. Multiple ways to get class object
    @Test
    public void test01() throws Exception {
        // 1. <classname>.class
        Class clazz1 = Car.class;

        // 2. <object>.getClass()
        Class clazz2 = new Car().getClass();

        // 3. Class.forName(<path>)
        Class clazz3 = Class.forName("com.example.reflect.Car");

        // Instantiate
        Car c = (Car) clazz3.getDeclaredConstructor().newInstance();
        System.out.println(c);
    }

    // 2. Get
    @Test
    public void test02() throws Exception {
        Class clazz = Car.class;
        // Get all public constructors
        // getConstructors() : get all public constructors
        // getDeclaredConstructors() : get all constructors
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor c : constructors) {
            System.out.println("Constructor name: " + c.getName() + ", Number of parameters: " + c.getParameterCount());
        }

        // Use multi-constructor to instantiate
        // Case 1: construct public
//        Constructor c1 = clazz.getConstructor(String.class, int.class, String.class);
//        Car car1 = (Car) c1.newInstance("BMW", 3, "red");
//        System.out.println(car1);

        // Case 2: construct private (use declared instead)
        Constructor c2 = clazz.getDeclaredConstructor(String.class, int.class, String.class);
        c2.setAccessible(true);
        Car car2 = (Car) c2.newInstance("Audi", 5, "black");
        System.out.println(car2);
    }

    // 3. Get instance variables
    @Test
    public void test03() throws Exception {
        Class clazz = Car.class;
        // Get all public instance variables
        Field[] publicFields = clazz.getFields();
        // Get all fields (include all private fields)
        Field[] fields = clazz.getDeclaredFields();

        Car car1 = (Car) clazz.getDeclaredConstructor().newInstance();

        for (Field f : fields) {
            if (f.getName().equals("name")) {
                // Enable access to private fields
                f.setAccessible(true);
                f.set(car1, "Benz");
            }
            System.out.println(f.getName());
            System.out.println(car1);
        }

    }

    // 4. Get methods
    @Test
    public void test04() throws Exception {
        Car c = new Car("Tesla", 4, "red");
        Class clazz = c.getClass();

        // 1. public method
        Method[] methods = clazz.getMethods();
        for (Method m1 : methods) {
//            System.out.println(m1.getName());

            // Call method
            if (m1.getName().equals("toString")) {
                String invoke = (String) m1.invoke(c);
                System.out.println("toString is called: " + invoke);
            }
        }

        // 2. private method
        Method[] methodsAll = clazz.getDeclaredMethods();
        for (Method m : methodsAll) {
            // Call private run()
            if (m.getName().equals("run")) {
                m.setAccessible(true);
                m.invoke(c);
            }
        }
    }
}
