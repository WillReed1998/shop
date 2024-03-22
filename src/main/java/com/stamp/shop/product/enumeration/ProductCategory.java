package com.stamp.shop.product.enumeration;

import lombok.Getter;

@Getter
public enum ProductCategory {
    HISTORY("HISTORY");

    private final String productCategory;

    ProductCategory(final String productCategory) {
        this.productCategory = productCategory;
    }
}
