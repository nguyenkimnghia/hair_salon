package com.codegym.hairstyle.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Hair {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String decent;

    @Column
    private int price;

    @OneToMany(mappedBy = "image")
    private List<Image> images;
}
