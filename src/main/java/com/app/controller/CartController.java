package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
    
    @RequestMapping("/cart")
    public String index(){
        return "user/cart/view";
    }
}
