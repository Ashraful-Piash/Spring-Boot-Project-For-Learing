package com.example.demo.config;


import com.example.demo.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("Audi 0");
        return  veh;
    }
    @Bean
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("My Audi");
        return veh;
    }

    @Bean
    String hello(){
        return "Hello world";
    }

    @Bean
    Integer number (){
        return 1;
    }
}
