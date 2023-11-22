package com.example.asmjav6.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "_order")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String address;
    @ManyToOne
    Account account;
    @OneToMany(mappedBy = "order")
    List<OrderDetail> orderDetails;

}
