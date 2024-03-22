package com.stamp.shop.product.entity;

import com.stamp.shop.product.enumeration.ProductCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "product_details")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private int yearOfIssue;
    private String countryOfIssue;
    private String series;

    @Enumerated(EnumType.STRING)
    private ProductCategory category;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Product product;
}