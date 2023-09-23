package com.app.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Product;

public interface ProductDAO extends JpaRepository<Product,String>{
    
}
