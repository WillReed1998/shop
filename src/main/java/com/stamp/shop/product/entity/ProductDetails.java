package com.stamp.shop.product.entity;

import com.stamp.shop.product.entity.enumeration.ProductCategory;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductDetails {
    private int yearOfIssue;
    private String countryOfIssue;
    private String series;
    private ProductCategory category;
}
