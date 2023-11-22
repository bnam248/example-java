package com.example.asmjav6.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name="_account")
public class Account implements Serializable {
    @Id
    String username;
    String password;
    String email;
    Integer phone_numer;
    Boolean Gender;
    boolean admin;
    @OneToMany(mappedBy = "account")
    List<Order> orders;
}
