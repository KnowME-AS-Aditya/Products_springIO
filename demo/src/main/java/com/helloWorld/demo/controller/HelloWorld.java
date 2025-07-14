package com.helloWorld.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String greetings() {
        return "Hello World, Welcome to Spring starter project!!";
    }
}
