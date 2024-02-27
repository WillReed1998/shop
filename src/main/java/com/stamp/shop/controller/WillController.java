package com.stamp.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/will")
public class WillController {

    @GetMapping
    public String will() {
        return "I am Will";
    }
}

