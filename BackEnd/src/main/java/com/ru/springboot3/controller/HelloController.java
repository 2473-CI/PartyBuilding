package com.ru.springboot3.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RequestMapping("/hello")
@RestController
public class HelloController {
    @GetMapping
    public String helloGetTest(){
        return "hello world";
    }
}
