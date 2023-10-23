package com.example.furniture.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    //get test
    @GetMapping("/test")
    public String test() {
        return "Swag Test";
    }
}
