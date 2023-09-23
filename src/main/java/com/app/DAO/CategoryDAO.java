package com.app.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Category;

public interface CategoryDAO extends JpaRepository<Category,String>{
    
}
