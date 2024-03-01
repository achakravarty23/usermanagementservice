package com.dpw.dtlp.logistics.usermanagementservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/hello-world")
    public String temp(){
        return "HELLO WORLD";
    }
}
