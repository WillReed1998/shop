package com.stamp.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/love")
public class LoveController {

    @GetMapping
    public String love() {
        return "I love Java ;)";
    }
}
