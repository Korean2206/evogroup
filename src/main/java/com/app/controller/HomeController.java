package com.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.DAO.ProductDAO;
import com.app.entity.Product;

@Controller
public class HomeController {
    
    @Autowired
    ProductDAO dao;
    @RequestMapping("home/index")
    public String index(Model model) {
        Optional<Product> p = dao.findById("ao01");
        model.addAttribute("p",p.get());
        System.out.println("Product name: "+p.get().getProductName());
        return "user/home";
    }
}
