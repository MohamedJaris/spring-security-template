package com.springSecurity.spring_security_template.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {
    @GetMapping(value = "/get")
    public String getUser() {
        return "Jaris";
    }
}
