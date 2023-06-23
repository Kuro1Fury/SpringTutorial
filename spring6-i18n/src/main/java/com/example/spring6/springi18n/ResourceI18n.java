package com.example.spring6.springi18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceI18n {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Object[] objs = new Object[]{"Allan", new Date().toString()};
        String value = context.getMessage("www.example.com", objs, Locale.CHINA);
        System.out.println(value);
    }
}
