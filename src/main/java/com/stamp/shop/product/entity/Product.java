package com.stamp.shop.product.entity;

import com.stamp.shop.product.entity.enumeration.ProductCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;

import java.math.BigDecimal;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;
import static org.hibernate.type.SqlTypes.JSON;

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
    private int yearOfIssue;
    private String countryOfIssue;
    private String series;
    private ProductCategory category;

    @Embedded
    private ProductDescription productDescription;

    @JdbcTypeCode(JSON)
    private List<Image> images;
}