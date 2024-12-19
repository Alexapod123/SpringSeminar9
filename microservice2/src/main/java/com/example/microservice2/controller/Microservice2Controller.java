package com.example.microservice2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceB")
public class Microservice2Controller {

    @GetMapping("/hello")
    public String hello(){
        return "HELLO, I'M MICROSERVICE №2";
    }
}
