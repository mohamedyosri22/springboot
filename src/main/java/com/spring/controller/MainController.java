package com.spring.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:9090

@RestController
@RequestMapping("/api")
// http://localhost:9090/api
public class MainController {

    @Value("${admin.name}")
    private String name;

    // http://localhost:9090/api/hi
    @GetMapping("/hi")
    public String sayHello(){
        return "hi "+name;
    }

    // http://localhost:9090/api/hello
    @GetMapping("/hello")
    public String sayFuck(){
        return "hello "+name;
    }

}
