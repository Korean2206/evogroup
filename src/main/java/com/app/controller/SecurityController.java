package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
    
    @GetMapping("/login")
    public String login(){
        return "user/security/login";
    }

    @GetMapping("/sign-up")
    public String signUp(){
        return "user/security/signup";
    }
}
