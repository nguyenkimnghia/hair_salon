package com.codegym.hairstyle.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String decent;

    @Column
    private String image;

    @Column
    private String price;

    @ManyToMany(mappedBy = "productCollection")
    @EqualsAndHashCode.Exclude
    private Collection<User> userCollection;

    public Product(String name, String decent, String image, String price) {
        this.name = name;
        this.decent = decent;
        this.image = image;
        this.price = price;
    }

    public Product() {
    }
}
