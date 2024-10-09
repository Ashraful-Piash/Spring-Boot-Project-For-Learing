package com.example.demo.main;

import com.example.demo.beans.Vehicle;
import com.example.demo.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setName("My Vehicle");
        System.out.println("Vehicle name from non-spring context " + vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean("vehicle1",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());

        String str = context.getBean(String.class);
        System.out.println("String value from context is " + str);

        Integer num = context.getBean(Integer.class);
        System.out.println("Integer value from context is " + num);
    }
}
