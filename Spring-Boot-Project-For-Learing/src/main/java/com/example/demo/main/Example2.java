package com.example.demo.main;


import com.example.demo.beans.Vehicle2;
import com.example.demo.config.ProjectConfig;
import com.example.demo.config.ProjectConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Example2 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig2.class);
        Vehicle2 vehicle2 = context.getBean(Vehicle2.class);
        System.out.println("Name is " + vehicle2.getName());
        vehicle2.printHello();

    }
}
