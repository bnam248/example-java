package com.example.asmjav6.dao;

import com.example.asmjav6.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDAO extends JpaRepository<Order , Long> {
}
