package com.example.microservice1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceA")
public class Microservice1Controller {

    @GetMapping("/hello")
    public String hello(){
        return "HELLO, I'M MICROSERVICE №1";
    }
}