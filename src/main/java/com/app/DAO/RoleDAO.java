package com.app.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Role;

public interface RoleDAO extends JpaRepository<Role,String> {
    
}
