package com.app.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.ProductVariant;

public interface ProductVariantDAO extends JpaRepository<ProductVariant,String> {
    
}
