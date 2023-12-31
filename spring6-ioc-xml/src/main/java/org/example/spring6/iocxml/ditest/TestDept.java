package org.example.spring6.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDept {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-dilist.xml");
        Department dept = context.getBean("dept", Department.class);
        dept.info();
    }
}
