package com.example.demoms1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1")


public class Demoms1Application {


    @Value("${server.port}")
    private String port;

    @GetMapping("/microservice1")
    public String test() {

        return "microservice name demoms1 is running on port: "+port;
    }


    public static void main(String[] args) {
        SpringApplication.run(Demoms1Application.class, args);
    }

}
