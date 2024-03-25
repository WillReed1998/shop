package com.stamp.shop.product.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;

import static org.hibernate.type.SqlTypes.JSON;

import java.math.BigDecimal;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String scu;
    private String name;
    private int numberOfReviews;
    private BigDecimal price;
    private Double discount;
    private int rating;
    private long quantityInStock;
    private String shortDescription;

    @JdbcTypeCode(JSON)
    private List<Image> images;
    private String nameOfSubblock;
    private String longDescription;

    @OneToOne
    private ProductDetails productDetails;
}