package com.example.asmjav6.dao;

import com.example.asmjav6.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDAO extends JpaRepository<Account,String> {
}
