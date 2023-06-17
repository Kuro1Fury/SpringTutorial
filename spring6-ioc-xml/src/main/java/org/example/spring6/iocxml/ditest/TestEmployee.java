package org.example.spring6.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        Employee employee = context.getBean("employee3", Employee.class);
        employee.work();
    }
}
