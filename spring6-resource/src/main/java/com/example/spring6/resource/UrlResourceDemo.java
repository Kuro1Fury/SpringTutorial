package com.example.spring6.resource;

import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;

// Demo of UrlResource
public class UrlResourceDemo {
    // prefix: http, file
    public static void loadUrlResource(String path) {
        // Construct Resource implementation class
        UrlResource url = null;
        try {
            url = new UrlResource(path);
            // Call Resource interface method
            System.out.println(url.getFilename());
            System.out.println(url.getURI());
            System.out.println(url.getDescription());
            System.out.println(url.getInputStream().read());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        // http prefix
//        loadUrlResource("http://www.google.com");

//        loadUrlResource("http://www.baidu.com");

        // file prefix
        loadUrlResource("file:example.txt");
    }
}
