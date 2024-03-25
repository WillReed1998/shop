package com.stamp.shop.product.entity;

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
public class ProductDescription {
    private Double discount;
    private int rating;
    private long quantityInStock;
    private String overview;
    private String headline;
    private String description;
}
