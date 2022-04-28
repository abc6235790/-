package com.tsst.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class testapp {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext applicationContext=SpringApplication.run(testapp.class,args);

    }
}
