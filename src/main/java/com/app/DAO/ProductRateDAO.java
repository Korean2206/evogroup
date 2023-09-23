package com.app.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.ProductRate;

public interface ProductRateDAO extends JpaRepository<ProductRate,Integer> {
    
}
