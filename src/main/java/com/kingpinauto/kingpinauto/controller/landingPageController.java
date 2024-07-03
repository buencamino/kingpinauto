package com.kingpinauto.kingpinauto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class landingPageController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello how are you?";
    }
}
