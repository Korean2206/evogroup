package com.app.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.User;

public interface UserDAO extends JpaRepository<User,String> {
    
}
