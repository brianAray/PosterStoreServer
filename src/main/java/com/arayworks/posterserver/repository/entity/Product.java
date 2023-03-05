package com.arayworks.posterserver.repository.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "small_image_url")
    private String smallImageUrl;

    @Column(name = "large_image_url")
    private String largeImageUrl;

    @Column(name = "category")
    private String category;

    @Column(name = "tags")
    private String[] tags;
}
