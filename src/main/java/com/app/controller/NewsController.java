package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewsController {
    
    @RequestMapping("/news")
    public String index(){
        return "user/news/index";
    }
    @RequestMapping("/news/detail")
    public String detail(){
        return "user/news/detail";
    }
}
