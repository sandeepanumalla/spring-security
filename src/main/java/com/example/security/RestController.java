package com.example.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/")
public class RestController {
    
    @GetMapping("secured")
    public String securedPage() {
        return "this is private page ";
    }

    @GetMapping("")
    public String homePage() {
        return "this is not a private page";
    }
}
