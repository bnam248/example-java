package com.example.asmjav6.dao;

import com.example.asmjav6.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailDAO extends JpaRepository<OrderDetail,Long> {
}
