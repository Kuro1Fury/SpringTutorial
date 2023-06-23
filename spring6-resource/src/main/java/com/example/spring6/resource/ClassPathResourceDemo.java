package com.example.spring6.resource;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

// Demo of ClassPathResource
public class ClassPathResourceDemo {

    public static void loadClassPathResource(String path) {
        // Create object
        ClassPathResource resource = new ClassPathResource(path);

        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());

        // Get file content
        try {
            InputStream in = resource.getInputStream();
            byte[] bytes = new byte[1024];
            while (in.read(bytes) != -1) {
                System.out.println(new String(bytes));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {
        loadClassPathResource("example.txt");
    }
}
