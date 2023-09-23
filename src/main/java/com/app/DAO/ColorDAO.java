package com.app.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Color;

public interface ColorDAO extends JpaRepository<Color,String> {
    
}
