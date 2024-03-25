package com.stamp.shop.product.entity;

import com.stamp.shop.product.entity.enumeration.ProductCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;

import static jakarta.persistence.GenerationType.IDENTITY;
import static org.hibernate.type.SqlTypes.NAMED_ENUM;

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

    @JdbcTypeCode(NAMED_ENUM)
    private ProductCategory category;

    @OneToOne
    @MapsId
    private Product product;
}