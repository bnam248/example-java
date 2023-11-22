package com.example.asmjav6.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "_product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_product;
    String name_product;
    String description;
    Double price;
    Integer quantity;

    @ManyToOne
    @JoinColumn(name = "id_category")
    Category category;
    @OneToMany(mappedBy = "product")
    List<OrderDetail> orderDetails;
    @OneToMany(mappedBy = "product")
    private List<Galery> galeries;

}
