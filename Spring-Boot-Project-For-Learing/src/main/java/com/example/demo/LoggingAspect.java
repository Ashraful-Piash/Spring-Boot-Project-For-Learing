package com.example.demo;

import org.junit.Before;
import org.springframework.stereotype.Component;

@Component
public class LoggingAspect {

    public void logger () {
        System.out.println("Loggers");
    }
}
