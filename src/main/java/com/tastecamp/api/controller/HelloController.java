package com.tastecamp.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ola")
public class HelloController {
    
    @GetMapping
    public String hello(){
        return "Olá Spring";
    }

}
