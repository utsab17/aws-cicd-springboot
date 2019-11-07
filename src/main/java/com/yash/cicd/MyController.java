package com.yash.cicd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class MyController{

    public String hello(){
        return "Hello From Spring Boot";
    }
}