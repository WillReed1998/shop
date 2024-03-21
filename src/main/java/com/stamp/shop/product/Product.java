package com.stamp.shop.product;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String scu;
    private String name;
    private int numberOfReviews;
    private BigDecimal price;
    private double discount;
    private int rating;
    private Long quantityInStock;
    private String shortDescription;

    @Type(JsonType.class)
    private String[] images;
    private String nameOfSubblock;
    private String longDescription;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private ProductDetails productDetails;
}