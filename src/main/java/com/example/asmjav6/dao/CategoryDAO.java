package com.example.asmjav6.dao;

import com.example.asmjav6.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO extends JpaRepository<Category,String> {
}
