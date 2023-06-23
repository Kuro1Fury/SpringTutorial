package com.example.spring6.resourceLoader;

import com.example.spring6.resource.ClassPathResourceDemo;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

public class Demo1 {

    @Test
    public void demo1() {
        ApplicationContext context = new ClassPathXmlApplicationContext();
        // ClassPathResource
        Resource resource = context.getResource("example.txt");
        System.out.println(resource.getFilename());
    }

    @Test
    public void demo2() {
        ApplicationContext context = new FileSystemXmlApplicationContext();
        // FileSystemResource
        Resource resource = context.getResource("example.txt");
        System.out.println(resource.getFilename());
    }
}
