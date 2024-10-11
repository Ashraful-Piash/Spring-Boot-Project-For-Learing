package com.example.demo;

import org.junit.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkout())")
    public void logger () {
        System.out.println("Loggers");
    }
}
