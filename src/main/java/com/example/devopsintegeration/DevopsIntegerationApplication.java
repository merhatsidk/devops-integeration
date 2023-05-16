package com.example.devopsintegeration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsIntegerationApplication {

    @GetMapping
    public String message(){
        return "welcome this is merha!";
    }
    public static void main(String[] args) {
        SpringApplication.run(DevopsIntegerationApplication.class, args);
    }

}
