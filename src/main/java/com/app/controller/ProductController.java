package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    
    @RequestMapping("/detail")
    public String detail() {
        return "user/product/detail";
    }
}
