package com.example.demo.beans;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Vehicle2 {

    private String name;

    public void printHello() {
        System.out.println("Hello from component vehicle bean");
    }
}
