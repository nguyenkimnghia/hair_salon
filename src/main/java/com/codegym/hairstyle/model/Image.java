package com.codegym.hairstyle.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String image;

    @ManyToOne
    @JoinColumn(name = "hair_id")
    @JsonBackReference
    private Hair hair;
}
