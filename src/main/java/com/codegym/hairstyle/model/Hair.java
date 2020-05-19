package com.codegym.hairstyle.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
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

    @OneToMany(mappedBy = "hair")
    @JsonManagedReference
    private List<Image> images = new ArrayList<>();
}
