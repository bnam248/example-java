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
@Table(name = "_category")
public class Category implements Serializable {
    @Id
    String id_category;
    String name_category;
    String description;
    @OneToMany(mappedBy = "category")
    List<Product> products;
}
