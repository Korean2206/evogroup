package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManagementController {
    
    
    @RequestMapping("/management/profile")
    public String profile() {
        return "user/management/profile";
    }
    @RequestMapping("/management/order")
    public String order() {
        return "user/management/order";
    }
    @RequestMapping("/management/address")
    public String address() {
        return "user/management/address";
    }
}
