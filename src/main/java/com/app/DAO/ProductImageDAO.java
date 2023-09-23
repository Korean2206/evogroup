package com.app.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.ProductImage;

public interface ProductImageDAO extends JpaRepository<ProductImage,Integer> {
    
}
