package com.stamp.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class WillController {
    @RestController
    @RequestMapping("/will")
    public class LoveController {

        @GetMapping
        public String will() {
            return "I am Will";
        }
    }
}