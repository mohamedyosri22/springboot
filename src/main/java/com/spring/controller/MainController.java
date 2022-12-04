package com.spring.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8080

@RestController
@RequestMapping("/api")
// http://localhost:8080/api
public class MainController {

    @Value("${admin.name}")
    private String name;

    // http://localhost:8080/api/hello
    @GetMapping("/hello")
    public String sayHello(){
        return "hello "+name;
    }
}
