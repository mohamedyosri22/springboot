package com.spring.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8080/

@RestController
@RequestMapping("/api")
// http://localhost:8080/api/
public class MainController {

    // http://localhost:8080/api/fuck/
    @GetMapping("/fuck")
    public String sayFuck(){
        return "fuck";
    }
}