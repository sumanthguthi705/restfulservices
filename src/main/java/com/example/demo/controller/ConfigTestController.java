package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigTestController {

    @Value("${student.message}")
    private String studentMessage;

    @Value("${student.owner}")
    private String studentOwner;

    @GetMapping("/config-test")
    public String getConfigValue() {
        return studentMessage + " - " + studentOwner;
    }
}