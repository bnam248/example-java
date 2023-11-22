package com.example.asmjav6.dao;

import com.example.asmjav6.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDAO extends JpaRepository<Product,Integer> {
}
