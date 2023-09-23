package com.app.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail,Integer> {
    
}
